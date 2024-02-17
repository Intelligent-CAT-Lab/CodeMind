import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] A = new boolean[10000];
        for(int i = 0;i < 10000;i++)A[i] = false;
        int count = 1;
        A[n - 1] = true;
        while(true){
            if(n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            if(A[n - 1] == true){
                break;
            }else{
                A[n - 1] = true;
                count += 1;
            }
        }
        System.out.println(count + 1);
    }
}