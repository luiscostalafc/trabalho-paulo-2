public class Palindromo {

    public static boolean palindromo(String str) {
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
            return palindromo(str.substring(1, str.length()-1));
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindromo("ovo")); // true
        System.out.println(palindromo("arara")); // true
        System.out.println(palindromo("xyzzyx")); // true
        System.out.println(palindromo("bola")); // false
        System.out.println(palindromo("xyzzy")); // false
    }
}