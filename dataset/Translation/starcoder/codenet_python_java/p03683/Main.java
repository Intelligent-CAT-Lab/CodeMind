import java.util.*;
public class p03683 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int thres=1000000007;
        if(Math.abs(N-M)==1){
            N=Math.min(N,M);
            int retVal=1;
            for(int i=1;i<=N;i++){
                retVal*=i*i;
                retVal%=thres;
            }
            retVal=(retVal*(N+1))%thres;
            System.out.println(retVal);
        }else if(N==M){
            int retVal=2;
            for(int i=1;i<=N;i++){
                retVal*=i*i;
                retVal%=thres;
            }
            System.out.println(retVal);
        }else{
            System.out.println(0);
        }
    }
}