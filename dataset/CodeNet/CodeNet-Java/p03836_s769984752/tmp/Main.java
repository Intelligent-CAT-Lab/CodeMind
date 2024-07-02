import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int sx = sc.nextInt();
System.out.println("[INST]7;sx;sc.nextInt();"+sx);
        int sy = sc.nextInt();
System.out.println("[INST]8;sy;sc.nextInt();"+sy);
        int tx = sc.nextInt();
System.out.println("[INST]9;tx;sc.nextInt();"+tx);
        int ty = sc.nextInt();
System.out.println("[INST]10;ty;sc.nextInt();"+ty);
        sc.close();

        for(int i = 0; i < tx-sx; i++){
            System.out.print("R");
        }
        for(int i = 0; i < ty-sy; i++){
            System.out.print("U");
        }
        
        for(int i = 0; i < tx-sx; i++){
            System.out.print("L");
        }
        for(int i = 0; i < ty-sy; i++){
            System.out.print("D");
        }

        System.out.print("D");
        for(int i = 0; i < tx-sx+1; i++){
            System.out.print("R");
        }
        for(int i = 0; i < ty-sy+1; i++){
            System.out.print("U");
        }
        System.out.print("L");

        System.out.print("U");
        for(int i = 0; i < tx-sx+1; i++){
            System.out.print("L");
        }
        for(int i = 0; i < ty-sy+1; i++){
            System.out.print("D");
        }
        System.out.print("R");
    }
}