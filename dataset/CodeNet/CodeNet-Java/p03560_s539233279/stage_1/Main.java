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
var newVariable_0 = deque.add(1);var newVariable_1 = deque.isEmpty();        while(!newVariable_1){
            int curr = deque.poll();
            int v1 = (curr + 1) % K;
            int v2 = (curr * 10) % K;

            if(dp[v1] > dp[curr] + 1){
var newVariable_2 = deque.addFirst(v1);                dp[v1] = dp[curr] + 1;
            }

            if(dp[v2] > dp[curr]){
var newVariable_3 = deque.addLast(v2);                dp[v2] = dp[curr];
            }
        }

        System.out.println(dp[0]);

    }

}

class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
var newVariable_4 = br.lines();    private static final Iterator<String> stringIterator = newVariable_4.iterator();
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() throws IOException {
var newVariable_5 = inputs.isEmpty();        if(newVariable_5){
var newVariable_6 = stringIterator.hasNext();            if(!newVariable_6) throw new IOException();
var newVariable_7 = inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));var newVariable_8 = Arrays.asList(stringIterator.next().split(" "));var newVariable_9 = stringIterator.next().split(" ");var newVariable_10 = stringIterator.next();            inputs.addAll(Arrays.asList(newVariable_10.split(" ")));
        }
    }

    Integer parseInt() throws IOException {
        fill();
var newVariable_11 = inputs.isEmpty();        if(!newVariable_11) {
var newVariable_12 = inputs.pollFirst();            return Integer.parseInt(newVariable_12);
        }
        throw new IOException();
    }

    Long parseLong() throws IOException {
        fill();
var newVariable_13 = inputs.isEmpty();        if(!newVariable_13) {
var newVariable_14 = inputs.pollFirst();            return Long.parseLong(newVariable_14);
        }
        throw new IOException();
    }

    Double parseDouble() throws IOException {
        fill();
var newVariable_15 = inputs.isEmpty();        if(!newVariable_15) {
var newVariable_16 = inputs.pollFirst();            return Double.parseDouble(newVariable_16);
        }
        throw new IOException();
    }

    String parseString() throws IOException {
        fill();
var newVariable_17 = inputs.pollFirst();        return newVariable_17;
    }

}