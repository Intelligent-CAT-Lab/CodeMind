import java.util.Scanner;

public class p02149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        int[] S = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            S[i] = Integer.parseInt(input[i]);
        }
        
        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < S.length; i++) {
            if (S[i] > maxValue) {
                maxValue = S[i];
                maxIndex = i;
            }
        }
        
        if (maxIndex == 0) {
            System.out.println("A");
        } else if (maxIndex == 1) {
            System.out.println("B");
        } else if (maxIndex == 2) {
            System.out.println("C");
        }
    }
}