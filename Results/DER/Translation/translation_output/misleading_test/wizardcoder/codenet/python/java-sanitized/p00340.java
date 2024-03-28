import java.util.Scanner;

public class p00340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for(int i=0;i<4;i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        int n = 0;
        for(int i=0;i<4;i++){
            if(num[i] == num[0] || num[i] == num[1] || num[i] == num[2] || num[i] == num[3]){
                n++;
            }
        }
        if(n == 4){
            System.out.println("n");
        }else{
            System.out.println("no");
        }
    }
}