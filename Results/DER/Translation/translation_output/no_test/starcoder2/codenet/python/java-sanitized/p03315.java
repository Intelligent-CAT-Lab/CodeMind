import java.util.Scanner;
public class p03315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int e = a.length() - a.replace("+", "").length();
        int f = a.length() - a.replace("-", "").length();
        System.out.println(e - f);
    }
}