import java.util.Scanner;
import java.util.Arrays;

public class p02393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assuming the input will always have three integers as per the Python example
        int[] s = new int[3];
        
        for (int i = 0; i < 3; i++) {
            s[i] = scanner.nextInt();
        }
        
        Arrays.sort(s);
        
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
        
        scanner.close();
    }
}