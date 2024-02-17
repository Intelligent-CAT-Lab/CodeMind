import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int numZeros = 0;
    for (char c : s) if (c == '0') numZeros++;
    System.out.println(Math.min(numZeros, s.length - numZeros) * 2);
  }
}
