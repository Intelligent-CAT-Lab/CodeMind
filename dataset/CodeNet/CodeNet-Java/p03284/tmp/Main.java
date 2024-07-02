import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
System.out.println("[INST]5;n;sc.nextInt();"+n);
System.out.println("[INST]5;k;sc.nextInt();"+k);
        if(n%k == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}