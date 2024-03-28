import java.util.Scanner;

public class p03797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int result = s + ((c-s*2)//4);
        if (s * 2 <= c) {
            System.out.println(result);
        } else {
            System.out.println(c/2);
        }
    }
}