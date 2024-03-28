import java.util.*;
public class p03429 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(n*m<2*(a+b)){
            System.out.println("NO");
            return;
        }
        if(n==1 || m==1){
            if(n==1 && m==1){
                if(a==0 && b==0){
                    System.out.println("YES");
                    System.out.println(".");
                }else{
                    System.out.println("NO");
                }
                return;
            }else if(n==1){
                if(b>=1){
                    System.out.println("NO");
                }else{
                    if(m/2<a){
                        System.out.println("NO");
                    }else{
                        for(int i=0;i<m/2;i++){
                            System.out.print("<>");
                        }
                        System.out.println();
                    }
                }
            }else if(m==1){
                if(a>=1){
                    System.out.println("NO");
                }else{
                    if(n/2<b){
                        System.out.println("NO");
                    }else{
                        for(int i=0;i<n/2;i++){
                            System.out.print("^v");
                        }
                        System.out.println();
                    }
                }
            }
        }else{
            if((n*m)%2!=1){
                if(n%2==1){
                    int tmp=Math.min(m/2,a);
                    a-=tmp;
                    for(int i=0;i<tmp;i++){
                        System.out.print("<>");
                    }
                    System.out.println();
                }
                if(m%2==1){
                    int tmp=Math.min(n/2,b);
                    b-=tmp;
                    for(int i=0;i<tmp;i++){
                        System.out.print("^v");
                    }
                    System.out.println();
                }
                for(int y=0;y<n-(n%2);y+=2){
                    for(int x=0;x<m-(m%2);x+=2){
                        if(a>=2){
                            a-=2;
                            System.out.print("<>");
                            System.out.print("<>");
                            System.out.print("<>");
                            System.out.