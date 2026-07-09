import java.util.Scanner;

import static Utils.CPFGenerator.gerarCPF;
import static Utils.CPFValidator.validarCPF;
import static Utils.CNPJGenerator.gerarCNPJ;
import static Utils.CNPJValidator.validarCNPJ;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== GERADOR E VALIDADOR =====");
            System.out.println("1 - Gerar CPF");
            System.out.println("2 - Validar CPF");
            System.out.println("3 - Gerar CNPJ");
            System.out.println("4 - Validar CNPJ");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\nCPF Gerado: " + gerarCPF());
                    break;

                case 2:
                    System.out.print("\nDigite o CPF: ");
                    String cpf = scanner.nextLine();

                    if (validarCPF(cpf)) {
                        System.out.println("CPF válido!");
                    } else {
                        System.out.println("CPF inválido!");
                    }
                    break;

                case 3:
                    System.out.println("\nCNPJ Gerado: " + gerarCNPJ());
                    break;

                case 4:
                    System.out.print("\nDigite o CNPJ: ");
                    String cnpj = scanner.nextLine();

                    if (validarCNPJ(cnpj)) {
                        System.out.println("CNPJ válido!");
                    } else {
                        System.out.println("CNPJ inválido!");
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}