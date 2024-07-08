import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String rand = sc.next();
        Stack<Integer> down = new Stack<>();
        Deque<Pool> s = new ArrayDeque<>();
        int sum = 0;
var newVariable_0 = rand.length();        for(int i = 0; i < newVariable_0; i++) {
            char c = rand.charAt(i);
            switch(c) {
                case '\\':
var newVariable_1 = down.push(i);                break;
                case '/':
var newVariable_2 = down.isEmpty();                if(!newVariable_2){
                    int j = down.pop();
var newVariable_3 = s.isEmpty();                    if(newVariable_3) {
                        s.addLast(new Pool(j, i - j));
                    }else {
                        int tmpS = i - j;
var newVariable_4 = s.isEmpty();var newVariable_5 = s.getLast();                        while(!s.isEmpty() && j < newVariable_5.j) {
var newVariable_6 = s.removeLast();                            tmpS += newVariable_6.s;
                        }
                        s.addLast(new Pool(j, tmpS));
                    }
                    sum += i - j;
                }
            }
        }

        System.out.println(sum);

        StringBuilder sb = new StringBuilder();
var newVariable_7 = sb.append(s.size());var newVariable_8 = s.size();        sb.append(newVariable_8);
var newVariable_9 = s.isEmpty();        while(!newVariable_9) {
var newVariable_10 = sb.append(" ").append(s.removeFirst().s);var newVariable_11 = sb.append(" ");var newVariable_12 = s.removeFirst();           sb.append(" ").append(newVariable_12.s);
        }
        System.out.println(sb);
        
        sc.close();
    }
}

class Pool {
    int j;
    int s;

    Pool(int j, int s) {
        this.j = j;
        this.s = s;
    }
}
