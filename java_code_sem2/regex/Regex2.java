import java.util.regex.*;
import java.util.*;

class Regex2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", data));// true
        sc.close();
    }
}
