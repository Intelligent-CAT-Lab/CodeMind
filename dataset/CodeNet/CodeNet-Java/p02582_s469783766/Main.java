import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solver solverObj = new Solver();
        System.out.println(solverObj.solve(s));
    }
}

class Solver {
    public int solve(String s){
        int max = 0;

        int left = 0;
        for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
             if(c == 'R'){
                 max = Math.max(max, i - left + 1);
             } else {
                 left = i + 1;
             }
        }
        return max;
    }
}
