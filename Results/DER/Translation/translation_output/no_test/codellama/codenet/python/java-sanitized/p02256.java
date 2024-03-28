import java.util.Scanner;

public class p02256 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter two integers: ");
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }
    while (x % y != 0) {
      int temp = y;
      y = x % y;
      x = temp;
    }
    System.out.println("