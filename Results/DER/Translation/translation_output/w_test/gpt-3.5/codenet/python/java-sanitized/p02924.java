import java.util.Scanner;

public class p02924 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = (n-1) * n / 2;
        System.out.println(result);
    }
}