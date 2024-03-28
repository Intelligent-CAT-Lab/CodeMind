import java.util.Scanner;
import java.lang.Math;

public class p03923 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int t = n;
        for (int k = 1; k < Math.ceil(Math.log(n) / Math.log(2)); k++) {
            int d = (int) Math.ceil(Math.pow(n,