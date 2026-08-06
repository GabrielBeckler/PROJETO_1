package Utils.Generators;

import java.util.Random;

public class CNPJGenerator {
    public static String gerarCNPJ() {
        Random random = new Random();

        int[] cnpj = new int[14];

        int[] pesos1 = {5,4,3,2,9,8,7,6,5,4,3,2};

        int[] pesos2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};
        for (int i = 0; i < 8; i++) {
            cnpj[i] = random.nextInt(10);
        }

        cnpj[8] = 0;
        cnpj[9] = 0;
        cnpj[10] = 0;
        cnpj[11] = 1;

        int soma = 0;

        for (int i = 0; i < 12; i++) {
            soma += cnpj[i] * pesos1[i];
        }

        int resto = soma % 11;
        cnpj[12] = (resto < 2) ? 0 : 11 - resto;



        soma = 0;

        for (int i = 0; i < 13; i++) {
            soma += cnpj[i] * pesos2[i];
        }

        resto = soma % 11;
        cnpj[13] = (resto < 2) ? 0 : 11 - resto;

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cnpj.length; i++) {

            resultado.append(cnpj[i]);

            if (i == 1 || i == 4) {
                resultado.append(".");
            }

            if (i == 7) {
                resultado.append("/");
            }

            if (i == 11) {
                resultado.append("-");
            }
        }

        return resultado.toString();
    }
}
