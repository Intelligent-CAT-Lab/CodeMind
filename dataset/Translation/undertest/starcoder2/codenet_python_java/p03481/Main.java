import java.util.Scanner;

public class p03481 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int k = (int) (Math.log(Y/X)/Math.log(2));
        System.out.println(k);
    }
}