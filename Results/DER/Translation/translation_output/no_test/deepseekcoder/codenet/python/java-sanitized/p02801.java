import java.util.Scanner;

public class p02801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String C = scanner.next();
        String al = "abcdefghijklmnopqrstuvwxyz";
        int idx = al.indexOf(C);
        if (idx != -1) {
            System.out.println(al.charAt(idx + 1));
        }
    }
}