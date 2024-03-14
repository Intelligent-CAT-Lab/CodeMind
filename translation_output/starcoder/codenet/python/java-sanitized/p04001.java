import java.util.*;
public class p04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(dfs(0,new int[s.length()+1],s,0));
    }
    public static int dfs(int i,int[] sep,String s,int tot){
        int n = s.length();
        i++;
        if(i==n){
            int ans = 0;
            if(sep.length>1){
                for(int j=0;j<sep.length-1;j++){
                    ans += Integer.parseInt(s.substring(sep[j],sep[j+1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length-1],n));
            return ans;
        }
        sep[sep.length] = i;
        tot += dfs(i,sep,s,0);
        sep[sep.length-1] = i;
        tot += dfs(i,sep,s,0);
        return tot;
    }
}