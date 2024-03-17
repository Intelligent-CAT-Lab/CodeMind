import java.util.*;

public class p02212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Math.abs(arr[0]+arr[3]-arr[1]-arr[2]));
    }
}