import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans = 0;
var newVariable_0 = s.length();        for(int dx=0;dx<=newVariable_0-1;dx++){
var newVariable_1 = s.length();            for(int start=0;start<=newVariable_1-1-dx;start++){
var newVariable_2 = s.substring(start,start+dx+1);                long cur = Long.parseLong(newVariable_2);
var newVariable_3 = s.length();                ans += cur*(helper(start)*helper(newVariable_3-1-dx-start));
            }
        }
        System.out.println(ans);
    }
    static long helper(int n){
        if(n==0) return 1;
        return 1<<(n-1);
    }
}
