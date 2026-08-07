public class Driver {
    public static void main(String[] args) 
    {
        String[] passwords = {
                "abc",
                "Abc123",
                "Abcd1234!",
                "hello123"
        };
        for (String pw : passwords) {

            System.out.println("Password : " + pw);
            System.out.println("Length : " + PasswordChecker.hasLength(pw));
            System.out.println("Upper : " + PasswordChecker.hasUpper(pw));
            System.out.println("Digit : " + PasswordChecker.hasDigit(pw));
            System.out.println("Special : " + PasswordChecker.hasSpecial(pw));
            System.out.println("Strength : " + PasswordChecker.strength(pw));
            System.out.println("---------------------");
        }
    }
}