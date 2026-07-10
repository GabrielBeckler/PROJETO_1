package Utils;

public class CNPJValidator {
    public static boolean validarCNPJ(String cnpj){
        cnpj = cnpj.replace(".", "")
                .replace("/", "")
                .replace("-", "");
        if (cnpj.length() != 14){
                return false;
            }

            if (cnpj.matches("(\\d)\\1{13}")){
                return false;
            }

            int[] pesos1 = {5,4,3,2,9,8,7,6,5,4,3,2};

            int[] pesos2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};

            int[] numbers = new int [14];

            for (int i = 0; i < 14; i++){
                numbers[i] = Character.getNumericValue(cnpj.charAt(i));
            }

            int sum = 0;

            for (int i = 0; i < 12; i ++){
                sum += numbers[i] * pesos1[i];
            }

            int resto = sum % 11;

            int dig1 = (resto < 2) ? 0 : 11 - resto;

            sum = 0;

            for (int i = 0; i < 13; i ++){
                sum += numbers[i] * pesos2[i];
            }

            resto = sum % 11;

            int dig2 = (resto < 2) ? 0 : 11 - resto;

            return numbers[12] == dig1 && numbers[13] == dig2;

        }
    }

