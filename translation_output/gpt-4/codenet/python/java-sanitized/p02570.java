import java.util.Scanner;

public class p02570 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        int[] data = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            data[i] = Integer.parseInt(input[i]);
        }
        
        if ((data[0] / (double) data[1]) <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}