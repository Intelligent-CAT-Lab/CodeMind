import java.util.Scanner;

public class p03587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int count = s.count("1");
        System.out.println("