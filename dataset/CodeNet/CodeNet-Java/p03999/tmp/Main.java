import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
        long ans = 0;
        for(int dx=0;dx<=s.length()-1;dx++){
System.out.println("[INST]7;None;s.length();"+s.length());
            for(int start=0;start<=s.length()-1-dx;start++){
System.out.println("[INST]8;None;s.length();"+s.length());
                long cur = Long.parseLong(s.substring(start,start+dx+1));
System.out.println("[INST]9;cur;Long.parseLong(s.substring(start,start+dx+1));"+cur);
System.out.println("[INST]9;None;s.substring(start,start+dx+1);"+s.substring(start,start+dx+1));
                ans += cur*(helper(start)*helper(s.length()-1-dx-start));
System.out.println("[INST]10;None;s.length();"+s.length());
            }
        }
        System.out.println(ans);
    }
    static long helper(int n){
        if(n==0) return 1;
        return 1<<(n-1);
    }
}
