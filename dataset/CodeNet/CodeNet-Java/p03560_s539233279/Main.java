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
        while(!deque.isEmpty()){
            int curr = deque.poll();
            int v1 = (curr + 1) % K;
            int v2 = (curr * 10) % K;

            if(dp[v1] > dp[curr] + 1){
                deque.addFirst(v1);
                dp[v1] = dp[curr] + 1;
            }

            if(dp[v2] > dp[curr]){
                deque.addLast(v2);
                dp[v2] = dp[curr];
            }
        }

        System.out.println(dp[0]);

    }

}

class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Iterator<String> stringIterator = br.lines().iterator();
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() throws IOException {
        if(inputs.isEmpty()){
            if(!stringIterator.hasNext()) throw new IOException();
            inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));
        }
    }

    Integer parseInt() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Integer.parseInt(inputs.pollFirst());
        }
        throw new IOException();
    }

    Long parseLong() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Long.parseLong(inputs.pollFirst());
        }
        throw new IOException();
    }

    Double parseDouble() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Double.parseDouble(inputs.pollFirst());
        }
        throw new IOException();
    }

    String parseString() throws IOException {
        fill();
        return inputs.pollFirst();
    }

}