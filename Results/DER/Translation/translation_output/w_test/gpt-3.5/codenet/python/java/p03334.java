```java
import java.util.Scanner;

class Main {
  
  public static int judge(int D) {
    int n = 1;
    while (D % 4 == 0) {
      n *= 2;
      D /= 4;
    }

    return D % 2 == 1 ? 1 : 2;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int D1 = scanner.nextInt();
    int D2 = scanner.nextInt();
    scanner.close();

    int j1 = judge(D1);
    int j2 = judge(D2);
    int cnt = 0;

    for (int x = 0; x < N * 2; x++) {
      for (int y = 0; y < N * 2; y++) {
        if ((j1 == 1 ? ~(x / j1 + y / j1) % 2 : ~(x / j1) % 2) == 1 
            && (j2 == 1 ? ~(x / j2 + y / j2) % 2 : ~(x / j2) % 2) == 1) {
          System.out.println(x + " " + y);
          cnt++;
          if (cnt >= N * N) {
            break;
          }
        }
      }
      if (cnt >= N * N) {
        break;
      }
    }
  }
}
```
