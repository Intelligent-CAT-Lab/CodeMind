import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String rand = sc.next();
System.out.println("[INST]9;rand;sc.next();"+rand);
        Stack<Integer> down = new Stack<>();
        Deque<Pool> s = new ArrayDeque<>();
        int sum = 0;
        for(int i = 0; i < rand.length(); i++) {
System.out.println("[INST]13;None;rand.length();"+rand.length());
            char c = rand.charAt(i);
System.out.println("[INST]14;c;rand.charAt(i);"+c);
            switch(c) {
                case '\\':
                down.push(i);
System.out.println("[INST]17;None;down.push(i);"+down.push(i));
                break;
                case '/':
                if(!down.isEmpty()){
System.out.println("[INST]20;None;down.isEmpty();"+down.isEmpty());
                    int j = down.pop();
System.out.println("[INST]21;j;down.pop();"+j);
                    if(s.isEmpty()) {
System.out.println("[INST]22;None;s.isEmpty();"+s.isEmpty());
                        s.addLast(new Pool(j, i - j));
System.out.println("[INST]23;None;s.addLast(new Pool(j, i - j));"+s.addLast(new Pool(j, i - j)));
                    }else {
                        int tmpS = i - j;
                        while(!s.isEmpty() && j < s.getLast().j) {
System.out.println("[INST]26;None;s.isEmpty();"+s.isEmpty());
System.out.println("[INST]26;None;s.getLast();"+s.getLast());
                            tmpS += s.removeLast().s;
System.out.println("[INST]27;None;s.removeLast();"+s.removeLast());
                        }
                        s.addLast(new Pool(j, tmpS));
System.out.println("[INST]29;None;s.addLast(new Pool(j, tmpS));"+s.addLast(new Pool(j, tmpS)));
                    }
                    sum += i - j;
                }
            }
        }

        System.out.println(sum);

        StringBuilder sb = new StringBuilder();
        sb.append(s.size());
System.out.println("[INST]39;None;sb.append(s.size());"+sb.append(s.size()));
System.out.println("[INST]39;None;s.size();"+s.size());
        while(!s.isEmpty()) {
System.out.println("[INST]40;None;s.isEmpty();"+s.isEmpty());
           sb.append(" ").append(s.removeFirst().s);
System.out.println("[INST]41;None;sb.append(' ').append(s.removeFirst().s);"+sb.append(" ").append(s.removeFirst().s));
System.out.println("[INST]41;None;sb.append(' ');"+sb.append(" "));
System.out.println("[INST]41;None;s.removeFirst();"+s.removeFirst());
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
