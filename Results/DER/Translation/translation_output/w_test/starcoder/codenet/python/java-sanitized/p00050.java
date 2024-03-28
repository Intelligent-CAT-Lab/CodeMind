import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p00050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern p = Pattern.compile("(apple|peach)");
        Matcher m = p.matcher(input);
        while (m.find()) {
            input = input.replace(m.group(), m.group().equals("apple")? "peach" : "apple");
        }
        System.out.println(input);
    }
}