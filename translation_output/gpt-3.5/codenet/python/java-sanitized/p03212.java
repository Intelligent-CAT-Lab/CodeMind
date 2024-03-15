import java.util.Scanner;

public class p03212 {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        System.out.println(dfs("0"));
    }

    static int dfs(String s) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        
        int ret = 1;
        if (s.contains("7") && s.contains("5") && s.contains("3")) {
            ret = 1;
        } else {
            ret = 0;
        }
        
        for (char c : new char[]{'7', '5', '3'}) {
            ret += dfs(s + c);
        }
        
        return ret;
    }
}