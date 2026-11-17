# Jarvis System

Sistema de gestão comercial desenvolvido em Java, com interface pelo terminal e integração com banco de dados relacional via JDBC.

O projeto tem como objetivo praticar Programação Orientada a Objetos, persistência de dados e modelagem de funcionalidades presentes em sistemas comerciais.

## Funcionalidades implementadas no menu

### Gerenciamento de clientes

- Cadastro de pessoas físicas e jurídicas.
- Listagem de clientes.
- Atualização de e-mail e telefone por ID.
- Exclusão de clientes por ID.
- Registro automático da data de cadastro.
- Validação de CEP com oito dígitos.
- Validação da entrada de datas.
- Tratamento de erros nas operações com o banco.

### Dados cadastrais

**Dados gerais:** nome, sobrenome, CEP, e-mail e telefone.

**Pessoa física:** CPF, RG, data de nascimento e profissão.

**Pessoa jurídica:** CNPJ, razão social, nome fantasia, inscrição estadual e data de fundação.

## Organização do projeto

Além do menu principal, o projeto conta com classes relacionadas a:

- Clientes.
- Produtos.
- Pedidos.
- Estoque.
- Pagamentos.
- Descontos.
- Identificação.
- Avaliações.
- Utilitários.

Essas classes compõem a modelagem do sistema. Sua existência não significa que todas as operações estejam integradas ao menu principal.

## Tecnologias e recursos

- Java.
- JDBC.
- SQL.
- Biblioteca dotenv para carregamento de configurações.
- Scanner para interação pelo terminal.
- LocalDate para manipulação de datas.
- PreparedStatement para consultas parametrizadas.
- Try-with-resources para fechamento de recursos JDBC.

## Como executar

1. Abra o projeto em uma IDE compatível com Java.
2. Configure um JDK compatível com a versão definida no projeto.
3. Instale ou restaure a dependência que fornece `io.github.cdimascio.dotenv.Dotenv`.
4. Disponibilize o driver JDBC correspondente ao banco utilizado.
5. Prepare o banco e suas tabelas com o script SQL do projeto, caso disponível.
6. Crie um arquivo `.env` no diretório de execução.
7. Execute a classe `MainMenu`.

O código utiliza blocos de texto, recurso disponível sem funcionalidades de prévia a partir do Java 15.

### Configuração do ambiente

Exemplo para uma conexão com MySQL:

```env
DB_URL=jdbc:mysql://localhost:3306/seu_banco
DB_USER=seu_usuario
DB_PASSWORD=sua_senha
```

Adicione o arquivo `.env` ao `.gitignore` e disponibilize apenas um `.env.example` com valores ilustrativos.

### Estrutura esperada para clientes

A classe MainMenu utiliza a tabela `customer` com os campos:

- `id`
- `customer_type`
- `first_name`
- `last_name`
- `date_register`
- `cep`
- `email`
- `tell`
- `cpf`
- `rg`
- `birth_date`
- `profession`
- `cnpj`
- `corporate_name`
- `trade_name`
- `state_registration`
- `foundation_date`

Os tipos, restrições e relacionamentos devem seguir o esquema completo do projeto.

## Estado de desenvolvimento

Na versão do MainMenu apresentada:

- O CRUD de clientes está implementado.
- A atualização de clientes altera e-mail e telefone.
- Os menus de produtos e pedidos possuem operações pendentes de integração.
- Estoque e avaliações aparecem no menu principal, mas ainda não possuem tratamento nesse arquivo.
- A consulta de pendências está indicada como funcionalidade em desenvolvimento.

## Aprendizados

- Modelagem de entidades com Programação Orientada a Objetos.
- Integração de aplicações Java com banco de dados.
- Operações de cadastro, consulta, atualização e exclusão.
- Uso de parâmetros em comandos SQL.
- Tratamento de exceções e validação de entradas.
- Configuração de conexão fora do código-fonte.

## Próximas evoluções

- Integrar os demais módulos ao menu.
- Ampliar as validações cadastrais.
- Tratar entradas não numéricas nos menus.
- Adicionar confirmação antes da exclusão.
- Separar a interface de terminal, as regras de negócio e o acesso ao banco.
