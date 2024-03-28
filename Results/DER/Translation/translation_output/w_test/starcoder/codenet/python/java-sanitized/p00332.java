import java.util.*;
public class p00332 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int Y = sc.nextInt();
        if(E==0){
            if(Y<=1912){
                System.out.println("M"+(1867-Y));
            }
            else if(Y<=1926){
                System.out.println("T"+(1911-Y));
            }
            else if(Y<=1989){
                System.out.println("S"+(1925-Y));
            }
            else{
                System.out.println("H"+(1988-Y));
            }
        }
        else if(E==1){
            System.out.println(1867+Y);
        }
        else if(E==2){
            System.out.println(1911+Y);
        }
        else if(E==3){
            System.out.println(1925+Y);
        }
        else{
            System.out.println(1988+Y);
        }
    }
}