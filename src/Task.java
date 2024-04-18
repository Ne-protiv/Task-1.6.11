import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    public static void main(String[] args) {
        String firstEmail = "228@gmail.com";
        String secondEmail = "fall@outlook.com.out";
        String thirdEmail = "@gmail.com";
        System.out.println(isGmailOrOutlook(firstEmail));
        System.out.println(isGmailOrOutlook(secondEmail));
        System.out.println(isGmailOrOutlook(thirdEmail));

    }

    public static boolean isGmailOrOutlook(String email) {
        Pattern gmailReg = Pattern.compile("^[a-zA-Z0-9]+@gmail.com");
        Pattern outlookReg = Pattern.compile("^[a-zA-Z0-9]+@outlook.com");
        Matcher gmail = gmailReg.matcher(email);
        Matcher outlook = outlookReg.matcher(email);
        return outlook.matches() || gmail.matches();
    }
}
