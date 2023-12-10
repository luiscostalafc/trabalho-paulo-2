public class Password {

    public boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }

    public boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }

    public boolean isValid(String password) {
        if (password.length() < 10) {
            return false;
        }

        int countLetters = 0;
        int countDigits = 0;

        for (char ch : password.toCharArray()) {
            if (isLetter(ch)) {
                countLetters++;
            } else if (isDigit(ch)) {
                countDigits++;
            }
        }

        return countLetters >= 3 && countDigits >= 2;
    }

    public static void main(String[] args) {
      Password passwordValidator = new Password();

      System.out.println(passwordValidator.isValid("password123")); // true
      System.out.println(passwordValidator.isValid("pass123")); // false
      System.out.println(passwordValidator.isValid("password")); // false
  }
    
}