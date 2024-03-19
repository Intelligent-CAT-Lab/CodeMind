import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= b) {
            System.out.println(repeatString(a, b));
        } else {
            System.out.println(repeatString(b, a));
        }
    }

    public static String repeatString(int a, int b) {
        String result = "";
        for (int i = 0; i < b; i++) {
            result += String.valueOf(a);
        }
        return result;
    }
}