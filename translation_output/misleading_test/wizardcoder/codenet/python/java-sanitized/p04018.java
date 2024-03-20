import java.util.*;
public class p04018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        int n=w.length();
        int t=-1;
        int[] zl=new int[n];
        int[] zr=new int[n];
        int[] f=new int[n];
        for(int i=0;i<n;i++){
            zl[i]=0;
            zr[i]=0;
            f[i]=1;
        }
        for(int i=1;i<n;i++){
            if(i<zl[i-1]){
                zl[i]=zl[i-1];
            }else{
                int j=Math.max(0,zl[i-1]-i);
                while(i+j<n && w.charAt(j)==w.charAt(i+j)){
                    j++;
                }
                zl[i]=j;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(i>n-2-zr[n-1-i]){
                zr[i]=zr[n-1-i];
            }else{
                int j=Math.max(0,zr[n-1-i]-n+2-i);
                while(i+j<n && w.charAt(j)==w.charAt(i+j)){
                    j++;
                }
                zr[i]=j;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=2;j<=zr[i]/i+1;j++){
                f[j*i-1]=0;
            }
        }
        for(int i=1;i<n/2+1;i++){
            if(n%i==0 && w.substring(0,n-i).equals(w.substring(i,n))){
                t=i;
                break;
            }
        }
        if(t==-1){
            System.out.println("1");
            System.out.println("1");
        }else if(t==1){
            System.out.println(n);
            System.out.println("1");
        }else{
            int cnt=0;
            for(int i=0;i<n-1;i++){
                if(zl[i]>0 && zr[n-2-i]>0){
                    cnt++;
                }
            }
            System.out.println("2");
            System.out.println(cnt);
        }
    }
}