package Utils.Validators;

public class CPFValidator {
    public static boolean validarCPF(String cpf) {

        cpf = cpf.replace(".", "").replace("-", "");
        if (cpf.length() != 11){
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")){
            return false;
        }

        int[] numbers = new int [11];

        for (int i = 0; i < 11; i++){
            numbers[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int sum = 0;

        for (int i = 0; i < 9; i ++){
            sum += numbers[i] * (10 - i);
        }

        int resto = sum % 11;

        int dig1 = (resto < 2) ? 0 : 11 - resto;

        sum = 0;

        for (int i = 0; i < 10; i ++){
            sum += numbers[i] * (11 - i);
        }

        resto = sum % 11;

        int dig2 = (resto < 2) ? 0 : 11 - resto;

        return numbers[9] == dig1 && numbers[10] == dig2;

    }
}
