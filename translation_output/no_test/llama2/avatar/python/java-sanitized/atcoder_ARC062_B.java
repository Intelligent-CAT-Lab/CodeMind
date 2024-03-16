import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        String s = sc.nextLine();
        switch (type) {
            case 1:
                System.out.println(s.split(" "));
                break;
            case 2:
                System.out.println(new String[] {s});
                break;
            case 3:
                System.out.println(new String[] {s});
                break;
            case 4:
                System.out.println(new String[] {s});
                break;
            default:
                System.out.println(s.split(" "));
                break;
        }
    }
}