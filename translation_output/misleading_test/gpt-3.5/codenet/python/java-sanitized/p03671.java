import java.util.*;

public class p03671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] abc = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            abc[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}