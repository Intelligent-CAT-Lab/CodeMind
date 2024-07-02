import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
System.out.println("[INST]7;K;scan.nextInt();"+K);
        int[] dp = new int[K];
        Arrays.fill(dp,Integer.MAX_VALUE);
System.out.println("[INST]9;None;Arrays.fill(dp,Integer.MAX_VALUE);"+Arrays.fill(dp,Integer.MAX_VALUE));

        class Node{
            int to,cost;
            Node(int to,int cost){
                this.to=to;
                this.cost=cost;
            }
        }

        PriorityQueue<Node> que = new PriorityQueue<>((a,b) -> a.cost-b.cost);
        for(int i=1;i<Math.min(10,K);++i){
System.out.println("[INST]20;None;Math.min(10,K);"+Math.min(10,K));
            dp[i]=i;
            que.add(new Node(i,i));
System.out.println("[INST]22;None;que.add(new Node(i,i));"+que.add(new Node(i,i)));
        }
        while(!que.isEmpty()){
System.out.println("[INST]24;None;que.isEmpty();"+que.isEmpty());
            Node node = que.poll();
System.out.println("[INST]25;node;que.poll();"+node);
            int v = node.to;
            int c = node.cost;
            if(c > dp[v])continue;
            for(int i=0;i<10;++i){
                int nextv = (v*10+i)%K;
                int nextc = c+i;
                if(dp[nextv] > nextc){
                    dp[nextv]=nextc;
                    que.add(new Node(nextv,nextc));
System.out.println("[INST]34;None;que.add(new Node(nextv,nextc));"+que.add(new Node(nextv,nextc)));
                }
            }
        }
        System.out.println(dp[0]);
    }
}