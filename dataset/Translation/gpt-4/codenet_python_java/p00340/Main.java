import java.util.Arrays;
import java.util.Scanner;

public class p00340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] num = new int[inputs.length];
        
        for (int i = 0; i < inputs.length; i++) {
            num[i] = Integer.parseInt(inputs[i]);
        }
        
        Arrays.sort(num);
        
        if (num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        scanner.close();
    }
}