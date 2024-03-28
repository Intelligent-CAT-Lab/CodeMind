import java.util.Scanner;

public class p03481 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();

        int k = (int) (Math.floor(Y / X) / Math.pow(2, Math.floor(Math.log(Y / X) / Math.log(2))));
        System.out.println(k);
    }
}



You can test this code with the following command:


java Main