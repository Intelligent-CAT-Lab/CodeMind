import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int[] data = new int[3];
      int sum = 0;
      for(int i =0;i<3;i++){
        data[i] = sc.nextInt();
System.out.println("[INST]8;None;sc.nextInt();"+sc.nextInt());
      }

      Arrays.sort(data);
System.out.println("[INST]11;None;Arrays.sort(data);"+Arrays.sort(data));

      sum = Math.abs(data[1]-data[0]);
System.out.println("[INST]13;sum;Math.abs(data[1]-data[0]);"+sum);
      sum = sum + Math.abs(data[1]-data[2]);
System.out.println("[INST]14;None;Math.abs(data[1]-data[2]);"+Math.abs(data[1]-data[2]));

      System.out.println(sum);

      }

  }
