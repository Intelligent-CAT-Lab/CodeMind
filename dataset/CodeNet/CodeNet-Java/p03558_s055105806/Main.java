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
			return Integer.compare(this.dist, arg0.dist);
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
			g.add(new ArrayList<>());
			dist[i] = INF;
		}
		for(int i=0; i<k; i++) {
			g.get(i).add(new Edge((i+1)%k, 1));
			g.get(i).add(new Edge((i*10)%k, 0));
		}
		calc(1);
		System.out.println(dist[0]+1);
		sc.close();
	}

	public void calc(int r) {
		PriorityQueue<P> q = new PriorityQueue<>();
		q.add(new P(r, 0));
		dist[r]=0;
		while(!q.isEmpty()) {
			P p = q.poll();
			if(dist[p.v]<p.dist) continue;
			for(Edge e : g.get(p.v)) {
				if(dist[e.to] > dist[p.v]+e.cost) {
					dist[e.to] =  dist[p.v]+e.cost;
					q.add(new P(e.to, dist[e.to]));
				}
			}
		}
	}
}
