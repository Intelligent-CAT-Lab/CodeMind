import java.util.Scanner;

public class p00993 {
    public static void main(String[] args) {
        int result = reduce(lambda x, y: x*y, range(1, 1501));
        result++;
        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= scanner.nextInt(); i++) {
            System.out.println(i+1);
        }
    }

    public static int reduce(int[] x, int lambda) {
        int result = 1;
        for (int i = 0; i < x.length; i++) {
            result *= lambda;
        }
        return result;
    }
}