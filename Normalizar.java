public class Normalizar {
    public String normalizar(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] parts = str.split(" ", 2);
        String firstWord = parts[0].substring(0, 1).toUpperCase() + parts[0].substring(1).toLowerCase();

        if (parts.length > 1) {
            return firstWord + " " + normalizar(parts[1]);
        } else {
            return firstWord;
        }
    }

    public static void main(String[] args) {
        Normalizar normalizador = new Normalizar();
        String nome = "paulo rene";
        String nomeNormalizado = normalizador.normalizar(nome);
        System.out.println(nomeNormalizado);
    }
}