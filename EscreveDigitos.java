import java.util.Scanner;

public class EscreveDigitos {

    public static String getDigitoEmString(int digito) {
        switch (digito) {
            case 0: return "zero";
            case 1: return "um";
            case 2: return "dois";
            case 3: return "três";
            case 4: return "quatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "sete";
            case 8: return "oito";
            case 9: return "nove";
            default: return "";
        }
    }

    public static int getDigito(int n, int i) {
        String num = Integer.toString(n);
        return Character.getNumericValue(num.charAt(i));
    }

    public static int getNumDigitos(int n) {
        return Integer.toString(n).length();
    }

    public static String mostraDigitosNaOrdemQueForamInseridos (int n) {
        String num = Integer.toString(n);
        String result = "";
        for (int i = 0; i < num.length(); i++) {
            result += getDigitoEmString(getDigito(n, i)) + " ";
        }
        return result;
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite um número positivo:");
      int num = scanner.nextInt();
      System.out.println(mostraDigitosNaOrdemQueForamInseridos(num));
      scanner.close();
    }
}