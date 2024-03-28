import java.util.Scanner;

public class p03697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int sum = a + b;
        System.out.println(sum);
        if (sum >= 10) {
            System.out.println("error");
        }
    }
}