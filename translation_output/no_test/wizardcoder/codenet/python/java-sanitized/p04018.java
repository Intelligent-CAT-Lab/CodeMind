import java.util.*;
public class p04018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        int n=w.length();
        int t=-1;
        for(int j=1;j<=n/2;j++){
            if(n%j==0 && w.substring(0,n-j).equals(w.substring(j))){
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
            Arrays.fill(zl,1);
            Arrays.fill(zr,1);
            for(int i=1;i<n;i++){
                if(w.charAt(i)==w.charAt(i-1)){
                    zl[i]=zl[i-1]+1;
                }
                else{
                    int j=Math.max(0,zl[i-zl[i-1]]);
                    while(i+j<n && w.charAt(i+j)==w.charAt(j)){
                        j++;
                    }
                    zl[i]=j;
                }
            }
            for(int i=n-2;i>=0;i--){
                if(w.charAt(i)==w.charAt(i+1)){
                    zr[i]=zr[i+1]+1;
                }
                else{
                    int j=Math.max(0,zr[i+zr[i+1]]);
                    while(i-j>=0 && w.charAt(i-j)==w.charAt(j)){
                        j++;
                    }
                    zr[i]=j;
                }
            }
            int cnt=0;
            for(int i=0;i<n-1;i++){
                if(zl[i]!=0 && zr[n-2-i]!=0){
                    cnt++;
                }
            }
            System.out.println("2");
            System.out.println(cnt);
        }
    }
}