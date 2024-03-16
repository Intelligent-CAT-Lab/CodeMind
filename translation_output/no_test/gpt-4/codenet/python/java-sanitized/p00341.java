import java.util.Scanner;

public class p00341 {
    public static void main(String[] args) {
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        
        // Assuming the input is given in a single line separated by space
        String[] input = scanner.nextLine().split(" ");
        int[] b = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            b[i] = Integer.parseInt(input[i]);
        }
        
        for (int i = 0; i < 12; i++) {
            a[b[i] - 1]++;
        }
        
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] != 0 && a[i] % 4 == 0) c += a[i] / 4;
        }
        
        System.out.println(c == 3 ? "yes" : "no");
        
        scanner.close();
    }
}