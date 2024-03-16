import java.util.*;
public class p04018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int t=-1;
        for(int j=1;j<=n/2;j++){
            if(n%j==0 && s.substring(0,n-j).equals(s.substring(j,n))){
                t=j;
                break;
            }
        }
        if(t==-1){
            System.out.println("1");
            System.out.println("1");
        }
        else if(t==1){
            System.out.println(n);
            System.out.println("1");
        }
        else{
            int[] zl=new int[n];
            int[] zr=new int[n];
            int cnt=0;
            for(int i=0;i<n-1;i++){
                zl[i]=zl[i-1];
                zr[i]=zr[i-1];
                if(s.charAt(i)==s.charAt(n-2-i)){
                    zl[i]=zl[i]+1;
                    zr[i]=zr[i]+1;
                }
                if(zl[i]!=0 && zr[n-2-i]!=0){
                    cnt++;
                }
            }
            System.out.println("2");
            System.out.println(cnt);
        }
    }
}