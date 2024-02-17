import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      int M = Integer.parseInt(sc.next());
      double c = 1900.0*M + 100.0*(N-M);
      double p = 1.0;
      double res = 0.0;
      double q = 1.0;
      for(int i = 0; i<M; i++) p *= 0.5;
      for(int i = 1; i<3000000; i++){
          res += i*c*p*q;
          q *= 1-p;
      }
      double eps = 0.0000001;
      int ret = (int)Math.floor(res+eps);
      System.out.println(ret);
  }
}