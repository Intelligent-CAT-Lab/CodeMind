import java.util.*;
public class p02690 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=-1000;i<=1000;i++){
            for(int j=-1000;j<=1000;j++){
                if(i*i*i*i*i-j*j*j*j*j==x){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}