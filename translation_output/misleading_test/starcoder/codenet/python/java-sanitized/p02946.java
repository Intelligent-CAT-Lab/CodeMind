import java.util.*;
public class p02946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[1000001];
        for(int i=0;i<1000001;i++) {
            arr[i] = i;
        }
        for(int i=0;i<1000001;i++) {
            arr[i] = arr[i] - K;
        }
        for(int i=0;i<1000001;i++) {
            arr[i] = arr[i] + K;
        }
        for(int i=0;i<1000001;i++) {
            if(arr[i] >= X && arr[i] <= X+K) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}