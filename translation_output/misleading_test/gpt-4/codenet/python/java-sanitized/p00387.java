import java.util.Scanner;

public class p00387 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int kimawasi = B / A;
        
        if (B % A > 0) {
            kimawasi = kimawasi + 1;
        }
        
        System.out.println(-kimawasi);
    }
}