import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.matches());
        sc.close();
    }
}
