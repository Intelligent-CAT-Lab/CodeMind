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
        for(int i = 0; i < rand.length(); i++) {
            char c = rand.charAt(i);
            switch(c) {
                case '\\':
                down.push(i);
                break;
                case '/':
                if(!down.isEmpty()){
                    int j = down.pop();
                    if(s.isEmpty()) {
                        s.addLast(new Pool(j, i - j));
                    }else {
                        int tmpS = i - j;
                        while(!s.isEmpty() && j < s.getLast().j) {
                            tmpS += s.removeLast().s;
                        }
                        s.addLast(new Pool(j, tmpS));
                    }
                    sum += i - j;
                }
            }
        }

        System.out.println(sum);

        StringBuilder sb = new StringBuilder();
        sb.append(s.size());
        while(!s.isEmpty()) {
           sb.append(" ").append(s.removeFirst().s);
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
