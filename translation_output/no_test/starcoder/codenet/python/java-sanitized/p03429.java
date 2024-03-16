import java.util.*;
public class p03429 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(n*m<2*(a+b)){
            System.out.println("NO");
            return;
        }
        if(n==1||m==1){
            if(n==1&&m==1){
                if(a==0&&b==0){
                    System.out.println("YES");
                    System.out.println(".");
                }else{
                    System.out.println("NO");
                    return;
                }
            }else{
                if(b>=1){
                    System.out.println("NO");
                    return;
                }else{
                    if(m/2<a){
                        System.out.println("NO");
                        return;
                    }else{
                        char[][] board=new char[n][m];
                        for(int i=0;i<m;i++){
                            if(i<m/2){
                                board[0][i]='<';
                                board[0][i+1]='>';
                            }else{
                                board[0][i]='>';
                                board[0][i+1]='>';
                            }
                        }
                        System.out.println("YES");
                        for(int i=0;i<n;i++){
                            for(int j=0;j<m;j++){
                                System.out.print(board[i][j]);
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }else{
            if((n*m)%2!=1){
                if(n%2==1){
                    int tmp=Math.min(m/2,a);
                    a-=tmp;
                    for(int i=0;i<tmp;i++){
                        board[n-1][2*i]='<';
                        board[n-1][2*i+1]='>';
                    }
                }
                if(m%2==1){
                    int tmp=Math.min(n/2,b);
                    b-=tmp;
                    for(int i=0;i<tmp;i++){
                        board[2*i][m-1]='^';
                        board[2*i+1][m-1]='v';
                    }
                }
                for(int y=0;y<n-(n%2);y+=2){
                    for(int x=0;x<m-(m%2);x+=2){
                        if(a>=2){
                            a-=2;
                            board[y][x]='<';
                            board[y][x+1]='>';
                            board[y+1][x]='