import java.util.*;
public class p02744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = new String[n];
        ans[0] = "a";
        for(int i=1;i<n;i++){
            String[] temp = new String[26];
            for(int j=0;j<26;j++){
                temp[j] = String.valueOf((char)(j+97));
            }
            for(int j=0;j<ans[i-1].length();j++){
                temp[ans[i-1].charAt(j)-97] = temp[ans[i-1].charAt(j)-97]+temp[ans[i-1].charAt(j)-97];
            }
            ans[i] = temp[0];
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}