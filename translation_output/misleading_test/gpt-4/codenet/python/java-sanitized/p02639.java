import java.util.Scanner;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] xList = new int[5];
        
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < 5; i++) {
            xList[i] = Integer.parseInt(input[i]);
        }
        
        for (int i = 0; i < 5; i++) {
            if (xList[i] == 0) {
                System.out.println(-(i + 1));
                break;
            }
        }
        
        scanner.close();
    }
}