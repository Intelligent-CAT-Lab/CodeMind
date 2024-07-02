import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
System.out.println("[INST]5;A;sc.nextInt();"+A);
        int B = sc.nextInt();
System.out.println("[INST]6;B;sc.nextInt();"+B);
        int C = sc.nextInt();
System.out.println("[INST]7;C;sc.nextInt();"+C);

        if(A==B){
            System.out.println(C);
        }else if(A==C){
            System.out.println(B);    
        }else{
            System.out.println(A);    
    }         
}
}