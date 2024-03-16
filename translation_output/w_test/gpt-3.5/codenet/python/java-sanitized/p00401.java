import java.util.Scanner;

public class p00401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        
        System.out.println(Math.round((double)count/2));
    }
}