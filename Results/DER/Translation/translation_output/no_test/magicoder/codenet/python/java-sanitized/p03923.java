import java.util.Scanner;
import java.lang.Math;

public class p03923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);

        int t = n;
        for (int k = 1; k <= Math.ceil(Math.log(n) / Math.log(2)); k++) {
            int d = (int) Math.ceil(Math.pow(n,