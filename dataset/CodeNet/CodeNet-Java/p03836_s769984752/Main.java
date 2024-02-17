import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
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