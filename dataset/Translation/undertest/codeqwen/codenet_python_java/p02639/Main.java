import java.util.Arrays;
import java.util.Scanner;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] xList = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            xList[i] = Integer.parseInt(input[i]);
        }
        
        for (int i = 0; i < xList.length; i++) {
            if (xList[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}