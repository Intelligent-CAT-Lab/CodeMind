import java.util.Scanner;

public class p03404 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    char[][] ar = new char[100][100];

    // Initialize first half of the grid with '#'
    for (int i = 0; i < 50; i++) {
      for (int j = 0; j < 100; j++) {
        ar[i][j] = '#';
      }
    }

    // Initialize second half of the grid with '.'
    for (int i = 50; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        ar[i][j] = '.';
      }
    }

    System.out.println("100 100");
    int count = 0;

    // Process first half of the grid for 'a'
    for (int i = 48; i >= 0; i -= 2) {
      if (count == a - 1) {
        break;
      }
      for (int j = i % 2 == 0 ? 0 : 1; j < 100; j += 2) {
        ar[i][j] = '.';
        count++;
        if (count == a - 1) {
          break;
        }
      }
    }

    count = 0;

    // Process second half of the grid for 'b'
    for (int i = 99; i > 50; i -= 2) {
      if (count == b - 1) {
        break;
      }
      for (int j = i % 2 == 0 ? 0 : 1; j < 100; j += 2) {
        ar[i][j] = '#';
        count++;
        if (count == b - 1) {
          break;
        }
      }
    }

    // Print the resulting grid
    for (char[] row : ar) {
      for (char c : row) {
        System.out.print(c);
      }
      System.out.println();
    }
    
    sc.close();
  }
}