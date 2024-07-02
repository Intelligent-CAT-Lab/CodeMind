import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long[] a = new long[3];
    for(int i = 0; i < 3; i++) {
      a[i] = sc.nextLong();
System.out.println("[INST]7;None;sc.nextLong();"+sc.nextLong());
    }
    Arrays.sort(a);
System.out.println("[INST]9;None;Arrays.sort(a);"+Arrays.sort(a));
    long ans = 0;
    if(((a[0] % 2) == 1) && ((a[1] % 2) == 1) && ((a[2] % 2) == 1)) ans = (a[0] * a[1]);
    System.out.println(ans);
  }
}