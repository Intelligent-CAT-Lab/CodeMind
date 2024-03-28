import java.util.*;

public class p03478 {
  public static void main(String...args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = 0;
    for(int i = 1; i <= N; i++) {
      int sum = 0;
      int j = i;
      while(j > 0) {
        sum += j % 10;
        j /= 10;
      }
      if(A <= sum && sum <= B)
        ans += i;
    }
    System.out.println(ans);
  }
}