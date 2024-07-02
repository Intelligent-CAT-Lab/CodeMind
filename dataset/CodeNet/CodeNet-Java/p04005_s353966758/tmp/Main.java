import java.util.*;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);

    long A = sc.nextLong();
System.out.println("[INST]6;A;sc.nextLong();"+A);
    long B = sc.nextLong();
System.out.println("[INST]7;B;sc.nextLong();"+B);
    long C = sc.nextLong();
System.out.println("[INST]8;C;sc.nextLong();"+C);

    long [] arr = new long[]{ A,B,C };
    Arrays.sort(arr);
System.out.println("[INST]11;None;Arrays.sort(arr);"+Arrays.sort(arr));

    long result = 0 ;
    if (A % 2 == 1 && B % 2 == 1 && C % 2 == 1 ) {
      result = arr[0] * arr[1];
      // result = Math.min(A * B, Math.min(A * C, B * C));
    }
    System.out.println(result);
  }
}

