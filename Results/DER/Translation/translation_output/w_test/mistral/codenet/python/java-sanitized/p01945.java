import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.indexOf('*');
        int p = Math.abs(s.substring(0, n).replaceAll("\\(", "").replaceAll(")", "").length() - s.substring(0, n).replaceAll(")", "").length());
        int q = Math.abs(s.substring(n + 1, s.length()).replaceAll("\\(", "").replaceAll(")", "").length() - s.substring(n + 1, s.length()).replaceAll(")", "").length());
        System.out.println(Math.min(p, q));
    }
}