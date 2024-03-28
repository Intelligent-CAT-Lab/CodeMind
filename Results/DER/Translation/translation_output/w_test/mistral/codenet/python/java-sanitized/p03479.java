import java.util.Scanner;

public class p03479 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 314159265;
        int b = 358979323846264338;
        int count = 1;
        int x = a;
        while (x * 2 <= b) {
            x = x * 2;
            count++;
        }
        System.out.println(count);
    }
}