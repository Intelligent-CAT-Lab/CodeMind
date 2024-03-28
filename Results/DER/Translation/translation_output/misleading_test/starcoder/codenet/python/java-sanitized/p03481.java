import java.util.*;
public class p03481 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[2];
        for(int i=0;i<2;i++){
            n[i] = sc.nextInt();
        }
        int X = n[0];
        int Y = n[1];
        int k = (int) (Math.log(Y/X)/Math.log(2));
        System.out.println(k);
    }
}