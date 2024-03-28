import java.util.Scanner;

public class p02534 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String s = "";
        for (int i = 0; i < k; i++) {
            s += "ACL";
        }
        System.out.println(s);
    }
}