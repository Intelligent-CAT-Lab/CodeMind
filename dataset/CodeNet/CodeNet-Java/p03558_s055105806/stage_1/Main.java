import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int to;
		int cost;
		Edge(int to, int cost){
			this.to=to;
			this.cost=cost;
		}
	}
	class P implements Comparable<P>{
		int v;
		int dist;
		P(int v, int dist){
			this.v=v;
			this.dist=dist;
		}
		@Override
		public int compareTo(P arg0) {
var newVariable_0 = Integer.compare(this.dist, arg0.dist);			return newVariable_0;
		}
	}

	int INF = 1001001001;
	ArrayList<ArrayList<Edge>> g = new ArrayList<>();
	int dist[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		dist = new int[k];
		for(int i=0; i<k; i++) {
var newVariable_1 = g.add(new ArrayList<>());			dist[i] = INF;
		}
		for(int i=0; i<k; i++) {
var newVariable_2 = g.get(i).add(new Edge((i+1)%k, 1));var newVariable_3 = g.get(i);			newVariable_3.add(new Edge((i+1)%k, 1));
var newVariable_4 = g.get(i).add(new Edge((i*10)%k, 0));var newVariable_5 = g.get(i);			newVariable_5.add(new Edge((i*10)%k, 0));
		}
		calc(1);
		System.out.println(dist[0]+1);
		sc.close();
	}

	public void calc(int r) {
		PriorityQueue<P> q = new PriorityQueue<>();
var newVariable_6 = q.add(new P(r, 0));		dist[r]=0;
var newVariable_7 = q.isEmpty();		while(!newVariable_7) {
			P p = q.poll();
			if(dist[p.v]<p.dist) continue;
var newVariable_8 = g.get(p.v);			for(Edge e : newVariable_8) {
				if(dist[e.to] > dist[p.v]+e.cost) {
					dist[e.to] =  dist[p.v]+e.cost;
var newVariable_9 = q.add(new P(e.to, dist[e.to]));				}
			}
		}
	}
}
