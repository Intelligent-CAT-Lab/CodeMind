import java.util.Scanner;

public class p02266 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int[][] g = new int[input.length()][2];
    int cnt = 0;
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == '_') {
        cnt = 0;
      } else if (c == '/') {
        cnt++;
      } else if (c == '\\') {
        cnt--;
      }
      g[i][0] = cnt;
      g[i][1] = false;
    }

    int gmax = g[0][0];
    for (int i = 1; i < g.length; i++) {
      if (g[i - 1][0] < g[i][0] && g[i][0] <= gmax) {
        g[i][1] = true;
      }
      gmax = Math.max(gmax, g[i][0]);
    }

    int[] puddles = new int[g.length];
    int volume = 0;
    int safaceLevel = null;

    for (int i = g.length - 1; i >= 0; i--) {
      if (safaceLevel != null) {
        volume += safaceLevel - g[i][0];
        if (safaceLevel == g[i][0]) {
          puddles[i] = volume;
          safaceLevel = null;
          volume = 0;
        }
      }
      if (safaceLevel == null && g[i][1]) {
        safaceLevel = g[i][0];
      }
    }

    System.out.println(sum(puddles));
    System.out.println(puddles.length + " " + String.join(" ", puddles));
  }

  private static int sum(int[] puddles) {
    int sum = 0;
    for (int puddle : puddles) {
      sum += puddle;
    }
    return sum;
  }
}