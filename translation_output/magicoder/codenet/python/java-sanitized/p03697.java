import java.util.Scanner;

public class p03697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int sum = a + b;
        if (sum < 10) {
            System.out.println(sum);
        } else {
            System.out.println("error");
        }
    }
}