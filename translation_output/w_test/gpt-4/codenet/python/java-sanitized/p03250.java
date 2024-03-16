import java.util.Arrays;
import java.util.Scanner;

public class p03250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(abc);
        int result = Integer.parseInt("" + abc[2] + abc[1]) + abc[0];
        System.out.println(result);
    }
}