package Utils.Generators;

import java.util.Random;

public class CPFGenerator {

    public static String gerarCPF() {
        Random random = new Random();

        int[] cpf = new int[11];

        for (int i = 0; i < 9; i++) {
            cpf[i] = random.nextInt(10);
        }

        int soma = 0;

        for (int i = 0; i < 9; i++) {
            soma += cpf[i] * (10 - i);
        }

        int resto = soma % 11;
        cpf[9] = (resto < 2) ? 0 : 11 - resto;

        soma = 0;

        for (int i = 0; i < 10; i++) {
            soma += cpf[i] * (11 - i);
        }

        resto = soma % 11;
        cpf[10] = (resto < 2) ? 0 : 11 - resto;

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cpf.length; i++) {

            resultado.append(cpf[i]);

            if (i == 2 || i == 5) {
                resultado.append(".");
            }

            if (i == 8) {
                resultado.append("-");
            }
        }

        return resultado.toString();
    }
}