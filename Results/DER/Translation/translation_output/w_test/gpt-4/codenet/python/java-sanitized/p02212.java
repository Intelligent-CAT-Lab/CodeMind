import java.util.*;
import java.lang.Math;

public class p02212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] l = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        
        Arrays.sort(l);
        
        int result = Math.abs((l[0] + l[3]) - (l[1] + l[2]));
        System.out.println(result);
        
        scanner.close();
    }
}