import java.util.Scanner;

public class p02474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        int result = num1 * num2;
        System.out.println(result);
    }
}