import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,A,B,pp;
        N=sc.nextInt();
System.out.println("[INST]5;N;sc.nextInt();"+N);
        A=sc.nextInt();
System.out.println("[INST]6;A;sc.nextInt();"+A);
        B=sc.nextInt();
System.out.println("[INST]7;B;sc.nextInt();"+B);
        pp=N*A;

        if(pp>B) System.out.println(B);
        else System.out.println(pp);
    }
}
