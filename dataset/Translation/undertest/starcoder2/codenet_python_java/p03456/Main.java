import java.util.Scanner;

public class p03456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int n = a * 10 + b;
        int sqrtn = (int) Math.sqrt(n);
        int i = 1;
        for (i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                break;
            }
        }
        if (i > sqrtn) {
            System.out.println("No");
        }
    }
}