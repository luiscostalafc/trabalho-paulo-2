public class SomaDigitos {
    public int somaDigitos(int n) {

        int soma = 0;

        while (n != 0) {
            soma += n % 10;
            n = n / 10;
        }

        return soma;
    }

    public static void main(String[] args) {
        SomaDigitos sd = new SomaDigitos();
        System.out.println(sd.somaDigitos(12345));
    }
}