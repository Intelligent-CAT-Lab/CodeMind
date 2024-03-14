import java.util.*;
public class p02427 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i;
        }
        int count = 0;
        for(int i=0;i<Math.pow(2,n);i++){
            String s = "";
            for(int j=0;j<n;j++){
                if((i & (1<<j)) > 0){
                    s += " "+arr[j];
                }
            }
            System.out.println(count+":"+s);
            count++;
        }
    }
}