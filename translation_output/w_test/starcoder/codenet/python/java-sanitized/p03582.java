import java.util.*;
public class p03582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[a+b+c];
        for(int i=0;i<a;i++) arr[i] = 0;
        for(int i=0;i<b;i++) arr[i+a] = 1;
        for(int i=0;i<c;i++) arr[i+a+b] = 2;
        Arrays.sort(arr);
        System.out.print(arr[0] == 0? "a" : arr[0] == 1? "b" : "c");
    }
}