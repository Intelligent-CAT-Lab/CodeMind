import java.util.Arrays;
import java.util.Scanner;

public class p03389 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        
        // Reading inputs
        for(int i = 0; i < 3; i++){
            a[i] = scanner.nextInt();
        }
        scanner.close();

        // Sorting the array
        Arrays.sort(a);
        
        int s = 0;
        
        // Applying the logic from Python code
        for (int i = 0; i < 2; i++){
            int tmp = a[2] - a[i];
            
            s += tmp / 2;
            a[i] += (tmp / 2) * 2;
        }
        
        s += (a[0] + a[1] + a[2]) % 3;
        
        // Printing the result
        System.out.println(s);
    }
}