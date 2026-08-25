import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.time.LocalDate;

public class MainMenu {

    static final String URL = "jdbc:mysql://127.0.0.1:3306/projeto1";
    static final String USER = "gbeck_dev";
    static final String PASS = "MinhaSenha123";

    static Scanner sc = new Scanner(System.in);

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void main(String[] args) throws SQLException {

        boolean stopMenu = false;

        while (!stopMenu) {

            System.out.println("""
                    
                    === MENU ===
                    1 - Client / CRUD
                    2 - Product / CRUD
                    3 - Order / CRUD
                    4 - Inventory
                    5 - See Reviews
                    6 - Exit
                    """);

            System.out.print("Escolha uma opção: ");
            int code = sc.nextInt();
            sc.nextLine();

            switch (code) {


                // CLIENTE

                case 1:

                    boolean stopClient = false;

                    while (!stopClient) {

                        System.out.println("""
                                
                                === CRUD CLIENT MENU ===
                                1 - Create (Cadastrar)
                                2 - Read (Listar)
                                3 - Update (Atualizar)
                                4 - Delete (Remover)
                                5 - View pending items
                                6 - Exit (Voltar)
                                """);

                        System.out.print("Escolha uma opção: ");
                        int codeClient = sc.nextInt();
                        sc.nextLine();

                        switch (codeClient) {

                            case 1 -> createClient();

                            case 2 -> readClients();

                            case 3 -> updateClient();

                            case 4 -> deleteClient();

                            case 5 ->
                                    System.out.println("Funcionalidade em desenvolvimento...");

                            case 6 ->
                                    stopClient = true;

                            default ->
                                    System.out.println("Opção inválida!");
                        }
                    }

                    break;

                // PRODUTO

                case 2:

                    boolean stopProduct = false;

                    while (!stopProduct) {

                        System.out.println("""
                                
                                === CRUD PRODUCT MENU ===
                                1 - Create
                                2 - Read
                                3 - Update
                                4 - Delete
                                5 - View pending items
                                6 - Exit
                                """);

                        System.out.print("Escolha uma opção: ");
                        int codeProduct = sc.nextInt();
                        sc.nextLine();

                        switch (codeProduct) {

                            case 6 -> stopProduct = true;

                            default ->
                                    System.out.println(
                                            "Implemente a lógica de Produto aqui analogamente ao Cliente."
                                    );
                        }
                    }

                    break;

                // PEDIDOS

                case 3:

                    boolean stopOrder = false;

                    while (!stopOrder) {

                        System.out.println("""
                                
                                === CRUD ORDER MENU ===
                                1 - Create
                                2 - Read
                                3 - Update
                                4 - Delete
                                5 - View pending items
                                6 - Exit
                                """);

                        System.out.print("Escolha uma opção: ");
                        int codeOrder = sc.nextInt();
                        sc.nextLine();

                        switch (codeOrder) {

                            case 6 -> stopOrder = true;

                            default ->
                                    System.out.println(
                                            "Implemente a lógica de Pedidos aqui."
                                    );
                        }
                    }

                    break;

                // SAIR

                case 6:

                    System.out.println("Encerrando o Jarvis System...");
                    stopMenu = true;

                    break;


                default:

                    System.out.println("Opção inválida!");
            }
        }
    }


    // CREATE CLIENT

    private static void createClient() throws SQLException {

        System.out.println(
                "Tipo de Cliente: [1] Pessoa Física (PERSON) ou [2] Pessoa Jurídica (COMPANY)?"
        );

        int type = sc.nextInt();
        sc.nextLine();

        String typeStr = (type == 2) ? "COMPANY" : "PERSON";


        // DADOS GERAIS

        System.out.print("Nome: ");
        String firstName = sc.nextLine();

        System.out.print("Sobrenome: ");
        String lastName = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String tell = sc.nextLine();

        // SQL

        String sql = """
                INSERT INTO customer (
                    customer_type,
                    first_name,
                    last_name,
                    date_register,
                    cep,
                    email,
                    tell,
                    cpf,
                    rg,
                    birth_date,
                    profession,
                    cnpj,
                    corporate_name,
                    trade_name,
                    state_registration,
                    foundation_date
                )
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;


        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            // DADOS GERAIS

            stmt.setString(1, typeStr);

            stmt.setString(2, firstName);

            stmt.setString(3, lastName);

            stmt.setObject(4, LocalDate.now());

            stmt.setString(5, cep);

            stmt.setString(6, email);

            stmt.setString(7, tell);


            // PESSOA FÍSICA

            if (typeStr.equals("PERSON")) {

                System.out.print("CPF: ");
                String cpf = sc.nextLine();
                stmt.setString(8, cpf);


                System.out.print("RG: ");
                String rg = sc.nextLine();
                stmt.setString(9, rg);


                System.out.print("Data de Nascimento (AAAA-MM-DD): ");
                String birthDate = sc.nextLine();

                stmt.setObject(
                        10,
                        LocalDate.parse(birthDate)
                );


                System.out.print("Profissão: ");
                String profession = sc.nextLine();

                stmt.setString(11, profession);


                // Campos de Pessoa Jurídica ficam NULL

                stmt.setNull(12, java.sql.Types.VARCHAR);
                stmt.setNull(13, java.sql.Types.VARCHAR);
                stmt.setNull(14, java.sql.Types.VARCHAR);
                stmt.setNull(15, java.sql.Types.VARCHAR);
                stmt.setNull(16, java.sql.Types.DATE);
            }



            // PESSOA JURÍDICA

            else {
                // Campos de Pessoa Física ficam NULL
                stmt.setNull(8, java.sql.Types.VARCHAR);
                stmt.setNull(9, java.sql.Types.VARCHAR);
                stmt.setNull(10, java.sql.Types.DATE);
                stmt.setNull(11, java.sql.Types.VARCHAR);

                System.out.print("CNPJ: ");
                String cnpj = sc.nextLine();

                stmt.setString(12, cnpj);

                System.out.print("Razão Social: ");
                String corporateName = sc.nextLine();

                stmt.setString(13, corporateName);

                System.out.print("Nome Fantasia: ");
                String tradeName = sc.nextLine();

                stmt.setString(14, tradeName);

                System.out.print("Inscrição Estadual: ");
                String stateRegistration = sc.nextLine();

                stmt.setString(15, stateRegistration);


                System.out.print("Data de Fundação (AAAA-MM-DD): ");
                String foundationDate = sc.nextLine();

                stmt.setObject(
                        16,
                        LocalDate.parse(foundationDate)
                );
            }


            // EXECUTAR INSERT

            stmt.executeUpdate();

            System.out.println(
                    "\nCliente salvo com sucesso no banco de dados!"
            );

        } catch (SQLException e) {

            System.err.println(
                    "Erro ao salvar cliente: " + e.getMessage()
            );
        }
    }


    // READ CLIENTS

    private static void readClients() {

        String sql = """
                SELECT
                    id,
                    customer_type,
                    first_name,
                    last_name,
                    email,
                    tell
                FROM customer
                """;


        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {

            System.out.println("\n--- LISTA DE CLIENTES ---");


            while (rs.next()) {

                System.out.printf(
                        "ID: %d | Tipo: %s | Nome: %s %s | Email: %s | Telefone: %s%n",

                        rs.getInt("id"),

                        rs.getString("customer_type"),

                        rs.getString("first_name"),

                        rs.getString("last_name"),

                        rs.getString("email"),

                        rs.getString("tell")
                );
            }


            System.out.println("-------------------------\n");


        } catch (SQLException e) {

            System.err.println(
                    "Erro ao listar clientes: " + e.getMessage()
            );
        }
    }


    // UPDATE CLIENT

    private static void updateClient() {
        readClients();
        System.out.print(
                "Digite o ID do cliente que deseja atualizar: "
        );

        int id = sc.nextInt();
        sc.nextLine();


        System.out.print("Novo Email: ");
        String novoEmail = sc.nextLine();


        System.out.print("Novo Telefone: ");
        String novoTell = sc.nextLine();


        String sql = """
                UPDATE customer
                SET email = ?, tell = ?
                WHERE id = ?
                """;


        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, novoEmail);

            stmt.setString(2, novoTell);

            stmt.setInt(3, id);


            int rows = stmt.executeUpdate();


            if (rows > 0) {

                System.out.println(
                        "Cliente atualizado com sucesso!"
                );

            } else {

                System.out.println(
                        "Nenhum cliente encontrado com o ID informado."
                );
            }


        } catch (SQLException e) {

            System.err.println(
                    "Erro ao atualizar cliente: " + e.getMessage()
            );
        }
    }


    // DELETE CLIENT

    private static void deleteClient() {
        readClients();
        System.out.print(
                "Digite o ID do cliente que deseja REMOVER: "
        );

        int id = sc.nextInt();
        sc.nextLine();


        String sql = """
                DELETE FROM customer
                WHERE id = ?
                """;


        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setInt(1, id);


            int rows = stmt.executeUpdate();


            if (rows > 0) {

                System.out.println(
                        "Cliente removido com sucesso!"
                );

            } else {

                System.out.println(
                        "Nenhum cliente encontrado com o ID informado."
                );
            }


        } catch (SQLException e) {

            System.err.println(
                    "Erro ao remover cliente: " + e.getMessage()
            );
        }
    }
}