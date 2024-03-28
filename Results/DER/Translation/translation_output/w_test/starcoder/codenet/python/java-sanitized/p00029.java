import java.util.*;
public class p00029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int max = 0;
        String maxStr = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxStr = arr[i];
            }
        }
        System.out.println(maxStr);
    }
}