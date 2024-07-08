import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long[] a = new long[3];
    for(int i = 0; i < 3; i++) {
var newVariable_0 = sc.nextLong();      a[i] = newVariable_0;
    }
    Arrays.sort(a);
    long ans = 0;
    if(((a[0] % 2) == 1) && ((a[1] % 2) == 1) && ((a[2] % 2) == 1)) ans = (a[0] * a[1]);
    System.out.println(ans);
  }
}