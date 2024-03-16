import java.util.*;

public class p04043 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    List<Integer> nums = Arrays.asList(a, b, c);
    Collections.sort(nums);
    if (nums.equals(Arrays.asList(5, 5, 7))) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}