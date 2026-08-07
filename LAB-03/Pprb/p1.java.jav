public class PasswordChecker {

    public static boolean hasLength(String pw) {
        return pw.length() >= 8;
    }

    public static boolean hasUpper(String pw) {
        return pw.matches(".*[A-Z].*");
    }

    public static boolean hasDigit(String pw) {
        return pw.matches(".*[0-9].*");
    }

    public static boolean hasSpecial(String pw) {
        return pw.matches(".*[^a-zA-Z0-9].*");
    }

    public static String strength(String pw) {

        int count = 0;

        if (hasLength(pw))
            count++;
        if (hasUpper(pw))
            count++;
        if (hasDigit(pw))
            count++;
        if (hasSpecial(pw))
            count++;

        if (count <= 1)
            return "Weak";
        else if (count <= 3)
            return "Medium";
        else
            return "Strong";
    }
}

------------------------------------------------------------------------
public class Driver {

    public static void main(String[] args) {

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