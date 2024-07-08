import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      long X = sc.nextLong();
      
      // 5乗テーブルの作成
      long[] fiveExp = new long[1000];
      for(int i = 0; i < 1000; i++){
        fiveExp[i] = 1L;
        for(int j = 0; j < 5; j++){
          fiveExp[i] = fiveExp[i] * i;
        }
      }
      
      // A,Bの探索
      int A = 0;
      int B = 0;
      
      LOOP : for(int i = 0; i < 1000; i++){
        for(int j = 0; j < 1000; j++){
          long work = X - fiveExp[j];
          if(work == fiveExp[i]){
            A = i;
            B = j * (-1);
            break LOOP;
          }
          
          work = X + fiveExp[j];
          if(work == fiveExp[i]){
            A = i;
            B = j;
            break LOOP;
          }
        }
      }
      
      
      // 出力
      System.out.println(A + " " + B);
    }

}