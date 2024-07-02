import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int A= entrada.nextInt();
System.out.println("[INST]5;A;entrada.nextInt();"+A);
        int B= entrada.nextInt();
System.out.println("[INST]6;B;entrada.nextInt();"+B);
        int C= entrada.nextInt();
System.out.println("[INST]7;C;entrada.nextInt();"+C);
        int N=(int)B/A;
        if (N>C){
            System.out.println(C);
        }
        else{
            System.out.println(N);
        }
    }
    
}
