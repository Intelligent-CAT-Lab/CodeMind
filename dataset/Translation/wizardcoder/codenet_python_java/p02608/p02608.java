import java.util.*;
public class p02608 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt[]=new int[n+1];
        for(int x=1;x<=100;x++){
            for(int y=1;y<=100;y++){
                for(int z=1;z<=100;z++){
                    int a=x*x+y*y+z*z+x*y+y*z+z*x;
                    if(a<=n){
                        cnt[a]++;
                    }
                }
            }
        }
        for(int i=1;i<=n;i++){
            System.out.println(cnt[i]);
        }
    }
}