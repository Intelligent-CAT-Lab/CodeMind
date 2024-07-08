import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int[] data = new int[3];
      int sum = 0;
      for(int i =0;i<3;i++){
var newVariable_0 = sc.nextInt();        data[i] = newVariable_0;
      }

      Arrays.sort(data);

      sum = Math.abs(data[1]-data[0]);
var newVariable_1 = Math.abs(data[1]-data[2]);      sum = sum + newVariable_1;

      System.out.println(sum);

      }

  }
