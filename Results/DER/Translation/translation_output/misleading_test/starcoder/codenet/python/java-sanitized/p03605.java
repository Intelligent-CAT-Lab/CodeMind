import java.util.Scanner;

public class p03605 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}