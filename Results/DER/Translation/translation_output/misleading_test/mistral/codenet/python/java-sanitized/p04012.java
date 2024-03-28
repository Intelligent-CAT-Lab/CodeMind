import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        String w = scanner.nextLine();
        for (char i : Alfa.toCharArray()) {
            if (w.indexOf(i) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

Sample test case:

abaccaba

Expected output:

Ye