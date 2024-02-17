//   1 2 3 4 5 6 7 8
// 1 0 1 1 1 1 1 1 1
// 2 0 0 2 2 2 2 2 2
// 3 0 1 0 3 3 3 3 3
// 4 0 0 1 0 4 4 4 4
// 5 0 1 2 1 0 5 5 5
// 6 0 0 0 2 1 0 6 6
// 7 0 1 1 3 2 1 0 7
// 8 0 0 2 0 3 2 1 0

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    long ans = 0;
    for (int i = K+1; i <= N; i++) {
      ans += (long)(i-K)*(N/i);
      if (N%i != 0 && N%i >= K) {
        ans += K == 0 ? N%i : N%i-K+1;
      }
    }
    System.out.println(ans);
  }
}