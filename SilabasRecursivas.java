public class SilabasRecursivas {
  public static int silabas(String str) {
    if (str.isEmpty()) {
        return 0;
    }
    if (isVogal(str.charAt(0))) {
        if (str.length() > 1 && isVogal(str.charAt(1))) {
            return silabas(str.substring(1));
        } else {
            return 1 + silabas(str.substring(1));
        }
    } else {
        return silabas(str.substring(1));
    }
}

public static boolean isVogal(char ch) {
    ch = Character.toLowerCase(ch);
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}

public static void main(String[] args) {
  System.out.println(silabas("programacao")); // Deve imprimir 5
  System.out.println(silabas("recursividade")); // Deve imprimir 6
  System.out.println(silabas("inteligencia artificial")); // Deve imprimir 9
}


}
