public class RemoveEspacosConsecutivos {
  public static String removeEspacosConsecutivos(String str) {
    if (str.length() <= 1) {
        return str;
    }
    if (str.charAt(0) == ' ' && str.charAt(1) == ' ') {
        return removeEspacosConsecutivos(str.substring(1));
    } else {
        return str.charAt(0) + removeEspacosConsecutivos(str.substring(1));
    }
}

 public static void main(String[] args) {
    System.out.println(removeEspacosConsecutivos("a  b  c")); // "a b c"
    System.out.println(removeEspacosConsecutivos("   a  b  c   ")); // " a b c "
    System.out.println(removeEspacosConsecutivos("   a  b  c   ")); // " a b c "
}

}