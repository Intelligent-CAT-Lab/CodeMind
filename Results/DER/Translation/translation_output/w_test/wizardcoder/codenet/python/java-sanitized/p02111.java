import java.util.Scanner;

public class p02111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] result = divmod(input*2, 60);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] divmod(int a, int b) {
        int[] result = new int[2];
        result[0] = a / b;
        result[1] = a % b;
        return result;
    }
}