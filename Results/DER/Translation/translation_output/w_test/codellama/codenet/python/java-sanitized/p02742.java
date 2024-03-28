import java.util.Scanner;

public class p02742 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        System.out.println(ceil(H*W/2) == 1 ? 1 : ceil(H*W/2));
    }

    public static double ceil(double x) {
        return Math.ceil(x);
    }
}