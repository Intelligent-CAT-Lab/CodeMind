import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            x[i] = sc.nextInt();
System.out.println("[INST]8;None;sc.nextInt();"+sc.nextInt());
            sum += x[i];
        }
        System.out.println(15-sum);
    }

}
