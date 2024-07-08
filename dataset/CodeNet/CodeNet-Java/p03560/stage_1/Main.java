import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int[] dp = new int[K];
        Arrays.fill(dp,Integer.MAX_VALUE);

        class Node{
            int to,cost;
            Node(int to,int cost){
                this.to=to;
                this.cost=cost;
            }
        }

        PriorityQueue<Node> que = new PriorityQueue<>((a,b) -> a.cost-b.cost);
var newVariable_0 = Math.min(10,K);        for(int i=1;i<newVariable_0;++i){
            dp[i]=i;
var newVariable_1 = que.add(new Node(i,i));        }
var newVariable_2 = que.isEmpty();        while(!newVariable_2){
            Node node = que.poll();
            int v = node.to;
            int c = node.cost;
            if(c > dp[v])continue;
            for(int i=0;i<10;++i){
                int nextv = (v*10+i)%K;
                int nextc = c+i;
                if(dp[nextv] > nextc){
                    dp[nextv]=nextc;
var newVariable_3 = que.add(new Node(nextv,nextc));                }
            }
        }
        System.out.println(dp[0]);
    }
}