import java.util.Arrays;
import java.util.Scanner;

class Main{

    static char[][] ans;
    static int N;
    static int M;

    static boolean evenSolver(int n,int m,int a,int b,int sy,int sx){
        if(n*m<2*(a+b))return false;
        if(n*m==2*(a+b) && a%2==1)return false;
        int i=0,j=0;
        while(a>0){
            ans[sy+i][sx+j]='<';
            ans[sy+i][sx+1+j]='>';
            --a;
            if(a>0){
                ans[sy+1+i][sx+j]='<';
                ans[sy+1+i][sx+1+j]='>';
            }
            --a;
            j+=2;
            if(j>=m){
                j=0;
                i+=2;
            }
        }

        while(b>0){
            ans[sy+i][sx+j]='^';
            ans[sy+i+1][sx+j]='v';
            --b;
            if(b>0){
                ans[sy+i][sx+j+1]='^';
                ans[sy+1+i][sx+1+j]='v';
            }
            --b;
            j+=2;
            if(j>=m){
                j=0;
                i+=2;
            }
        }
        return true;
    }


    static void printSolve(boolean t){
        if(t){
            System.out.println("YES");
            for(char[] carray : ans){
                System.out.println(String.valueOf(carray));
                System.out.println();
            }
        }else{
            System.out.println("NO");
        }

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        int A=scan.nextInt();
        int B=scan.nextInt();
        ans = new char[N][M];
        for(char[] c : ans)Arrays.fill(c, '.');
        
        if(N%2 == 0 && M%2 == 0)printSolve(evenSolver(N, M, A, B, 0, 0));
        else if(N%2==0 || M%2==0){
            if(N%2==0){
                for(int i=0;i<N;i+=2)if(B>0){
                    --B;
                    ans[i][0]='^';
                    ans[i+1][0]='v';
                }
                printSolve(evenSolver(N, M-1, A, B, 0, 1));
            }else{
                for(int j=0;j<M;j+=2)if(A>0){
                    --A;
                    ans[0][j]='<';
                    ans[0][j+1]='>';
                }
                printSolve(evenSolver(N-1, M, A, B, 1, 0));
            }
        }else{
            char ans_[][] = {{'<','>','^'},
            {'^','.','v'},
            {'v','<','>'}};
            for(int i=0;i<N-1;i+=2)if(B>0){
                --B;
                ans[i][M-1]='^';
                ans[i+1][M-1]='v';
            }
            for(int j=0;j<M-1;j+=2)if(A>0){
                --A;
                ans[N-1][j]='<';
                ans[N-1][j+1]='>';
            }
            if(A>0 && B>0 && A%2==1){
                for(int i=0;i<3;++i)for(int j=0;j<3;++j)ans[N-3+i][M-3+j]=ans_[i][j];
                A-=1;B-=1;
                printSolve(2*(A+B)<=(N-1)*(M-1)-4 && evenSolver(N-1,M-1,A,B,0,0));
            }else{
                printSolve(evenSolver(N-1,M-1,A,B,0,0));
            }
        }


    }
}