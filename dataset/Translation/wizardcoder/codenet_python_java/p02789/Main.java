import java.util.Scanner;

public class p02789 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[2];
    for (int i = 0; i < 2; i++) {
      a[i] = sc.nextInt();
    }
    if (a[0] == a[1]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}