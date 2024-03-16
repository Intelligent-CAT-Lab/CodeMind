import java.util.*;
public class p02825 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println(-1);
            System.exit(0);
        }
        if(n==3){
            System.out.println("abb");
            System.out.println("a.c");
            System.out.println("ddc");
            System.exit(0);
        }
        if(n==5){
            System.out.println("aabbc");
            System.out.println("hi..c");
            System.out.println("hi..d");
            System.out.println("g.jjd");
            System.out.println("gffee");
            System.exit(0);
        }
        if(n==7){
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.out.println("aax..aa");
            System.out.println("bbx..bb");
            System.out.println("cc.yycc");
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.exit(0);
        }
        char[][] a=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]='.';
            }
        }
        if(n%2!=0){
            a[n-5][n-5]='a';
            a[n-5][n-4]='a';
            a[n-5][n-3]='b';
            a[n-5][n-2]='b';
            a[n-5][n-1]='b';
            a[n-4][n-5]='h';
            a[n-4][n-4]='i';
            a[n-4][n-3]='.';
            a[n-4][n-2]='c';
            a[n-4][n-1]='.';
            a[n-3][n-5]='h';
            a[n-3][n-4]='i';
            a[n-3][n-3]='.';
            a[n-3][n-2]='d';
            a[n-3][n-1]='.';
            a[n-2][n-5]='g';
            a[n-2][n-4]='.';
            a[n-2][n-3]='j';
            a[n-2][n-2]='j';
            a[n-2][n-1]='d';
            a[n-1][n-5]='g';
            a[n-1][n-4]='f';
            a[n-1][n-3]='e';
            a[n-1][n-2]='e';
            a[n-1][n-1]='e';
            n-=5;
        }
        for(int i=0;i<n;i+=2){
            a[i][i]='a';
            a[i][i+1]='a';
            a[i+1][i]='b';
            a[i+1][i+1]='b';
        }
        if(n%4==0){
            for(int i=0;i<n;i+=2){
                a[n-i-2][i]='c';
                a[n-i-2][i+1]='d';
                a[n-i-1][i]='c';
                a[n-i-1][i+1]='d';
            }
        }
        else{
            for(int i=0;i<n-2;i+=2){
                a[i][i+2]='c';
                a[i][i+3]='d';
                a[i+1][i+2]='c';
                a[i+1][i+3]='d';
            }
            a[n-2][0]='c';
            a[n-2][1]='d';
            a[n-1][0]='c';
            a[n-1][1]='d';
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}