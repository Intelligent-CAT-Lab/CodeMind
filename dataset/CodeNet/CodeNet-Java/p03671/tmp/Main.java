import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]6;c;sc.nextInt();"+c);

        int[] sum = {a,b,c};
        Arrays.sort(sum);
System.out.println("[INST]9;None;Arrays.sort(sum);"+Arrays.sort(sum));

        System.out.println(sum[0]+sum[1]);
    }

}
