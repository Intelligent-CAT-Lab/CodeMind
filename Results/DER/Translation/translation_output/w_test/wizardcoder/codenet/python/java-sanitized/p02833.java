import java.util.*;
public class p02833 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int div=10;
            int tot=0;
            if(n%2!=0){
                System.out.println(0);
            }
            else{
                while(n>=div){
                    tot+=(n/div);
                    div*=5;
                }
                System.out.println(tot);
            }
        }
    }
}