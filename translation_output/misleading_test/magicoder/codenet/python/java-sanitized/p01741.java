import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sqrtN = Math.sqrt(n);
        double floorN = Math.floor(n);
        double result = sqrtN < floorN + 1 ? sqrtN : floorN + 1;
        System.out.println(result);
    }
}


You can test this code with the following test input: