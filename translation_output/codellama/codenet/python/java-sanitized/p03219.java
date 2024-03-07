import java.util.Scanner;

public class p03219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first side: ");
        int ab = scanner.nextInt();
        System.out.print("Enter the length of the second side: ");
        int bc = scanner.nextInt();
        int fare = (ab + bc) / 2;
        System.out.println("