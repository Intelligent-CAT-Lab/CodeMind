import java.util.ArrayList;
import java.util.Scanner;

public class p02406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            if(i%3==0 || String.valueOf(i).contains("3")){
                A.add(i);
            }
        }
        System.out.print(" ");
        for(int i=0; i<A.size()-1; i++){
            System.out.print(A.get(i) + " ");
        }
        System.out.println(A.get(A.size()-1));
    }
}