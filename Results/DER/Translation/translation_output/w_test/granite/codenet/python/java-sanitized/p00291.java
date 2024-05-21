import java.util.Scanner;

public class p00291 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1 = scanner.nextInt();
        int c5 = scanner.nextInt();
        int c10 = scanner.nextInt();
        int c50 = scanner.nextInt();
        int c100 = scanner.nextInt();
        int c500 = scanner.nextInt();
        int sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500;
        System.out.println(sum >= 1000? 1 : 0);
    }
}