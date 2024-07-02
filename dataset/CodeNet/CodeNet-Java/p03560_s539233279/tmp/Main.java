import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Parser parser = new Parser();

    public static void main(String[] args) throws IOException {

        int K = parser.parseInt();
        int[] dp = new int[K];
        Arrays.fill(dp, Integer.MAX_VALUE);

        Deque<Integer> deque = new ArrayDeque<>();

        dp[1] = 1;
        deque.add(1);
System.out.println("[INST]18;None;deque.add(1);"+deque.add(1));
        while(!deque.isEmpty()){
System.out.println("[INST]19;None;deque.isEmpty();"+deque.isEmpty());
            int curr = deque.poll();
System.out.println("[INST]20;curr;deque.poll();"+curr);
            int v1 = (curr + 1) % K;
            int v2 = (curr * 10) % K;

            if(dp[v1] > dp[curr] + 1){
                deque.addFirst(v1);
System.out.println("[INST]25;None;deque.addFirst(v1);"+deque.addFirst(v1));
                dp[v1] = dp[curr] + 1;
            }

            if(dp[v2] > dp[curr]){
                deque.addLast(v2);
System.out.println("[INST]30;None;deque.addLast(v2);"+deque.addLast(v2));
                dp[v2] = dp[curr];
            }
        }

        System.out.println(dp[0]);

    }

}

class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Iterator<String> stringIterator = br.lines().iterator();
System.out.println("[INST]43;stringIterator;br.lines().iterator();"+stringIterator);
System.out.println("[INST]43;None;br.lines();"+br.lines());
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() throws IOException {
        if(inputs.isEmpty()){
System.out.println("[INST]47;None;inputs.isEmpty();"+inputs.isEmpty());
            if(!stringIterator.hasNext()) throw new IOException();
System.out.println("[INST]48;None;stringIterator.hasNext();"+stringIterator.hasNext());
            inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));
System.out.println("[INST]49;None;inputs.addAll(Arrays.asList(stringIterator.next().split(' ')));"+inputs.addAll(Arrays.asList(stringIterator.next().split(" "))));
System.out.println("[INST]49;None;Arrays.asList(stringIterator.next().split(' '));"+Arrays.asList(stringIterator.next().split(" ")));
System.out.println("[INST]49;None;stringIterator.next().split(' ');"+stringIterator.next().split(" "));
System.out.println("[INST]49;None;stringIterator.next();"+stringIterator.next());
        }
    }

    Integer parseInt() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
System.out.println("[INST]55;None;inputs.isEmpty();"+inputs.isEmpty());
            return Integer.parseInt(inputs.pollFirst());
System.out.println("[INST]56;None;inputs.pollFirst();"+inputs.pollFirst());
        }
        throw new IOException();
    }

    Long parseLong() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
System.out.println("[INST]63;None;inputs.isEmpty();"+inputs.isEmpty());
            return Long.parseLong(inputs.pollFirst());
System.out.println("[INST]64;None;inputs.pollFirst();"+inputs.pollFirst());
        }
        throw new IOException();
    }

    Double parseDouble() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
System.out.println("[INST]71;None;inputs.isEmpty();"+inputs.isEmpty());
            return Double.parseDouble(inputs.pollFirst());
System.out.println("[INST]72;None;inputs.pollFirst();"+inputs.pollFirst());
        }
        throw new IOException();
    }

    String parseString() throws IOException {
        fill();
        return inputs.pollFirst();
System.out.println("[INST]79;None;inputs.pollFirst();"+inputs.pollFirst());
    }

}