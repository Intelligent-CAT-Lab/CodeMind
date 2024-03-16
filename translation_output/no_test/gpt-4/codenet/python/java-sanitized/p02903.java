import java.util.Scanner;

public class p02903 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.print(new String(new char[a]).replace("\0", "0"));
                System.out.println(new String(new char[w - a]).replace("\0", "1"));
            } else {
                System.out.print(new String(new char[a]).replace("\0", "1"));
                System.out.println(new String(new char[w - a]).replace("\0", "0"));
            }
        }

        scanner.close();
    }
}