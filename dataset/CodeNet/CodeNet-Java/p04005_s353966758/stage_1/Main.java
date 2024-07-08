import java.util.*;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);

    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();

    long [] arr = new long[]{ A,B,C };
    Arrays.sort(arr);

    long result = 0 ;
    if (A % 2 == 1 && B % 2 == 1 && C % 2 == 1 ) {
      result = arr[0] * arr[1];
      // result = Math.min(A * B, Math.min(A * C, B * C));
    }
    System.out.println(result);
  }
}

