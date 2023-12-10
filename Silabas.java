public class Silabas {
  static boolean isVogal(char ch) {
    ch = Character.toLowerCase(ch);
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}

static int countVogais(String str) {
    if (str.length() == 0) {
        return 0;
    } else {
        return (isVogal(str.charAt(0)) ? 1 : 0) + countVogais(str.substring(1));
    }
}

static int countParesVogais(String str) {
    if (str.length() < 2) {
        return 0;
    } else {
        return (isVogal(str.charAt(0)) && isVogal(str.charAt(1)) ? 1 : 0) + countParesVogais(str.substring(1));
    }
}

static int silabas(String str) {
    return countVogais(str) - countParesVogais(str);
}

public static void main(String[] args) {
    System.out.println(silabas("valor")); // Deve imprimir 2
    System.out.println(silabas("biblioteca")); // Deve imprimir 4
    System.out.println(silabas("java")); // Deve imprimir 2
}
}
