import java.util.*;
public class p03789 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        n=new StringBuilder(n).reverse().toString();
        int lb=0,ub=n.length();
        while(ub-lb>1){
            int mid=(lb+ub)/2;
            if(check(n,mid)){
                ub=mid;
            }else{
                lb=mid;
            }
        }
        System.out.println(ub);
    }
    public static boolean check(String n,int x){
        int g=0;
        for(int i=0;i<n.length();i++){
            x-=(x+g-n.charAt(i)-48)%10;
            if(x<0){
                return false;
            }
            g=(x+g)/10;
        }
        return x>=0;
    }
}