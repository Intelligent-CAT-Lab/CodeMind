import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
System.out.println("[INST]5;X;sc.nextLong();"+X);
        Long Y = sc.nextLong();
System.out.println("[INST]6;Y;sc.nextLong();"+Y);

        int i=0;
        while(X<=Y){
            i++;
            X*=2;
        }

        System.out.println(i);
    }
}