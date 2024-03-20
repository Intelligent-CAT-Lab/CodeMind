import java.util.*;

public class p03149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] a = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(a);
        int[] b = {1,4,7,9};
        if(Arrays.equals(a,b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}