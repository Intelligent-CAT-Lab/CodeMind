import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String res = sc.next();
System.out.println("[INST]4;res;sc.next();"+res);
        int day = res.length();
System.out.println("[INST]5;day;res.length();"+day);
        int nday = 15-day;
        int cnt = 0;
        for(int i = 0;i < day;i++){
            char r = res.charAt(i);
System.out.println("[INST]9;r;res.charAt(i);"+r);
            if(r == 'o')
            cnt++;
        }
        if((day <= 7)||((day >= 8)&&((cnt+nday) >= 8))){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}