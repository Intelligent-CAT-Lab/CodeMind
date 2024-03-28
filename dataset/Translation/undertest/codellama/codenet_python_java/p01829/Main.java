import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class p01829 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        int number = Integer.parseInt(input);
        int max = Integer.MAX_VALUE;
        int result = 0;
        int ten = (int) Math.pow(10, length);
        for (int[] a : permutations(IntStream.range(0, 10).toArray())) {
            int b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            int tm = Math.max(Math.abs(number - b), ten - Math.abs(number - b));
            if (max > tm) {
                max = tm;
                result = Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining());
            }
        }
        System.out.println(result);
    }

    public static int[][] permutations(int[] arr) {
        int[][] result = new int[factorial(arr.length)][arr.length];
        int[][] temp = new int[arr.length][arr.length];
        int[][] temp2 = new int[arr.length][arr.length];
        int[][] temp3 = new int[arr.length][arr.length];
        int[][] temp4 = new int[arr.length][arr.length];
        int[][] temp5 = new int[arr.length][arr.length];
        int[][] temp6 = new int[arr.length][arr.length];
        int[][] temp7 = new int[arr.length][arr.length];
        int[][] temp8 = new int[arr.length][arr.length];
        int[][] temp9 = new int[arr.length][arr.length];
        int[][] temp10 = new int[arr.length][arr.length];
        int[][] temp11 = new int[arr.length][arr.length];
        int[][] temp12 = new int[arr.length][arr.length];
        int[][] temp13 = new int[arr.length][arr.length];
        int[][] temp14 = new int[arr.length][arr.length];
        int[][] temp15 = new int[arr.length][arr.length];
        int[][] temp16 = new int[arr.length][arr.length];
        int[][] temp17 = new int[arr.length][arr.length];
        int[][] temp18 = new int[arr.length][arr.length];
        int[][] temp19 = new int[arr.length][arr.length];
        int[][] temp20 = new int[arr.length][arr.length];
        int[][] temp21 = new int[arr.length][arr.length];
        int[][] temp22 = new int[arr.length][arr.length];
        int[][] temp23 = new int[arr.length][arr.length];
        int[][] temp24 = new int[arr.length][arr.length];
        int[][] temp25 = new int[arr.length][arr.length];
        int[][] temp26 = new int[arr.length][arr.length];
        int[][] temp27 = new int[arr.length][arr.length];
        int[][] temp28 = new int[arr.length][arr.length];
        int[][] temp29 = new int[arr.length][arr.length];
        int[][] temp30 = new int[arr.length][arr.length];
        int[][] temp31 = new int[arr.length][arr.length];
        int[][] temp32 = new int[arr.length][arr.length];
        int[][] temp33 = new int[arr.length][arr.length];
        int[][] temp34 = new int[arr.length][arr.length];
        int[][] temp35 = new int[arr.length][arr.length];
        int[][] temp36 = new int[arr.length][arr.length];
        int[][] temp37 = new int[arr.length][arr.length];
        int[][] temp38 = new int[arr.length][arr.length];
        int[][] temp39 = new int[arr.length][arr.length];
        int[][] temp40 = new int[arr.length][arr.length];
        int[][] temp41 = new int[arr.length][arr.length];
        int[][] temp42 = new int[arr.length][arr.length];
        int[][] temp43 = new int[arr.length][arr.length];
        int[][] temp44 = new int[arr.length][arr.length];
        int[][] temp45 = new int[arr.length][arr.length];
        int[][] temp46 = new int[arr.length][arr.length];
        int[][] temp47 = new int[arr.length][arr.length];
        int[][] temp48 = new int[arr.length][arr.length];
        int[][] temp49 = new int[arr.length][arr.length];
        int[][] temp50 = new int[arr.length][arr.length];
        int[][] temp51 = new int[arr.length][arr.length];
        int[][] temp52 = new int[arr.length][arr.length];
        int[][] temp53 = new int[arr.length][arr.length];
        int[][] temp54 = new int[arr.length][arr.length];
        int[][] temp55 = new int[arr.length][arr.length];
        int[][] temp56 = new int[arr.length][arr.length];
        int[][] temp57 = new int[arr.length][arr.length];
        int[][] temp58 = new int[arr.length][arr.length];
        int[][] temp59 = new int[arr.length][arr.length];
        int[][] temp60