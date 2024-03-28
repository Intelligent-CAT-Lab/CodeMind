import java.util.Scanner;

public class p03219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();

        int fare = ab + bc / 2;

        System.out.println(fare);
    }
}


You can test this code with the following test input:


81 58


And it will output:


127