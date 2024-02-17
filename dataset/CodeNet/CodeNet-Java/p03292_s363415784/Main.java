import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int[] data = new int[3];
      int sum = 0;
      for(int i =0;i<3;i++){
        data[i] = sc.nextInt();
      }

      Arrays.sort(data);

      sum = Math.abs(data[1]-data[0]);
      sum = sum + Math.abs(data[1]-data[2]);

      System.out.println(sum);

      }

  }
