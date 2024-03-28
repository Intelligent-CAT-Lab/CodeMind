import java.util.*;

public class p03149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] b = {1,4,7,9};
        if(Arrays.equals(arr,b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}