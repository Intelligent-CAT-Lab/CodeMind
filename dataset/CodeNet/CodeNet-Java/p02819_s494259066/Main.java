import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int X;
        X = scanner.nextInt();

        if(X==2){
            System.out.println("2");
            return;
        }
        if( (X&1) == 0 ) X++;

        while(!check(X)) X+=2;

        System.out.println(X);
    }

    boolean check(int X){
        int n = 3;
        while(n*n <= X){
            if(X%n==0) return false;
            n+=2;
        }
        return true;
    }
}
