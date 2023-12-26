import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Test the email validation function
        String[] emails = {
                "user@example.com",
                "user123@gmail.com",
                "invalid.email@.com",
                "noatsign.email.com",
                "user@.com",
                "@domain.com"
        };

        for (String email : emails) {
            System.out.println(email + " is valid: " + isValidEmail(email));
        }
    }
}
