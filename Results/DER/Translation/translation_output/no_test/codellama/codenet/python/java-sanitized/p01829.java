import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class p01829 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        int r = 0;
        int t = (int) Math.pow(10, l);
        for (int[] a : permutations(IntStream.range(0, 10).toArray())) {
            int b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                r = Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining());
            }
        }
        System.out.println(r);
    }

    public static int[][] permutations(int[] arr) {
        int[][] result = new int[factorial(arr.length)][arr.length];
        int[][] result2 = new int[factorial(arr.length)][arr.length];
        int[][] result3 = new int[factorial(arr.length)][arr.length];
        int[][] result4 = new int[factorial(arr.length)][arr.length];
        int[][] result5 = new int[factorial(arr.length)][arr.length];
        int[][] result6 = new int[factorial(arr.length)][arr.length];
        int[][] result7 = new int[factorial(arr.length)][arr.length];
        int[][] result8 = new int[factorial(arr.length)][arr.length];
        int[][] result9 = new int[factorial(arr.length)][arr.length];
        int[][] result10 = new int[factorial(arr.length)][arr.length];
        int[][] result11 = new int[factorial(arr.length)][arr.length];
        int[][] result12 = new int[factorial(arr.length)][arr.length];
        int[][] result13 = new int[factorial(arr.length)][arr.length];
        int[][] result14 = new int[factorial(arr.length)][arr.length];
        int[][] result15 = new int[factorial(arr.length)][arr.length];
        int[][] result16 = new int[factorial(arr.length)][arr.length];
        int[][] result17 = new int[factorial(arr.length)][arr.length];
        int[][] result18 = new int[factorial(arr.length)][arr.length];
        int[][] result19 = new int[factorial(arr.length)][arr.length];
        int[][] result20 = new int[factorial(arr.length)][arr.length];
        int[][] result21 = new int[factorial(arr.length)][arr.length];
        int[][] result22 = new int[factorial(arr.length)][arr.length];
        int[][] result23 = new int[factorial(arr.length)][arr.length];
        int[][] result24 = new int[factorial(arr.length)][arr.length];
        int[][] result25 = new int[factorial(arr.length)][arr.length];
        int[][] result26 = new int[factorial(arr.length)][arr.length];
        int[][] result27 = new int[factorial(arr.length)][arr.length];
        int[][] result28 = new int[factorial(arr.length)][arr.length];
        int[][] result29 = new int[factorial(arr.length)][arr.length];
        int[][] result30 = new int[factorial(arr.length)][arr.length];
        int[][] result31 = new int[factorial(arr.length)][arr.length];
        int[][] result32 = new int[factorial(arr.length)][arr.length];
        int[][] result33 = new int[factorial(arr.length)][arr.length];
        int[][] result34 = new int[factorial(arr.length)][arr.length];
        int[][] result35 = new int[factorial(arr.length)][arr.length];
        int[][] result36 = new int[factorial(arr.length)][arr.length];
        int[][] result37 = new int[factorial(arr.length)][arr.length];
        int[][] result38 = new int[factorial(arr.length)][arr.length];
        int[][] result39 = new int[factorial(arr.length)][arr.length];
        int[][] result40 = new int[factorial(arr.length)][arr.length];
        int[][] result41 = new int[factorial(arr.length)][arr.length];
        int[][] result42 = new int[factorial(arr.length)][arr.length];
        int[][] result43 = new int[factorial(arr.length)][arr.length];
        int[][] result44 = new int[factorial(arr.length)][arr.length];
        int[][] result45 = new int[factorial(arr.length)][arr.length];
        int[][] result46 = new int[factorial(arr.length)][arr.length];
        int[][] result47 = new int[factorial(arr.length)][arr.length];
        int[][] result48 = new int[factorial(arr.length)][arr.length];
        int[][] result49 = new int[factorial(arr.length)][arr.length];
        int[][] result50 = new int[factorial(arr.length)][arr.length];
        int[][] result51 = new int[factorial(arr.length)][arr.length];
        int[][] result52 = new int[factorial(arr.length)][arr.length];
        int[][] result53 = new