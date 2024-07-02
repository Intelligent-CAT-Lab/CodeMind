    import java.util.*;
    public class Main {
      public static void main(String...args) {
      	final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
System.out.println("[INST]4;N;sc.nextInt();"+N);
        final int A = sc.nextInt();
System.out.println("[INST]5;A;sc.nextInt();"+A);
        final int B = sc.nextInt();
System.out.println("[INST]6;B;sc.nextInt();"+B);
        int ans = 0;
        for(int i = 1; i <= N; i++) {
          int sum = 0;
          for(int j = i; j > 0; j /= 10)
            sum += j % 10;
          if(A <= sum && sum <= B)
            ans += i;
        }
        System.out.println(ans);
      }
    }