import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
        Solver solverObj = new Solver();
        System.out.println(solverObj.solve(s));
    }
}

class Solver {
    public int solve(String s){
        int max = 0;

        int left = 0;
        for(int i=0;i<s.length();i++){
System.out.println("[INST]16;None;s.length();"+s.length());
             char c = s.charAt(i);
System.out.println("[INST]17;c;s.charAt(i);"+c);
             if(c == 'R'){
                 max = Math.max(max, i - left + 1);
System.out.println("[INST]19;max;Math.max(max, i - left + 1);"+max);
             } else {
                 left = i + 1;
             }
        }
        return max;
    }
}
