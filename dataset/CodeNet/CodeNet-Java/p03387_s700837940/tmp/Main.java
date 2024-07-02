import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
System.out.println("[INST]17;lines;in.readLine().split(' ');"+lines);
System.out.println("[INST]17;None;in.readLine();"+in.readLine());
      int[] arr = new int[lines.length];
      int k=0;
      for (String s : lines) {
        arr[k++] = Integer.parseInt(s); 
System.out.println("[INST]21;None;Integer.parseInt(s);"+Integer.parseInt(s));
      }
      Arrays.sort(arr);
System.out.println("[INST]23;None;Arrays.sort(arr);"+Arrays.sort(arr));
      int step=0;
      if(arr[2] - arr[1] > 3) {
        for(; arr[1]+3 < arr[2]; step++) {
          arr[1] += 2;
        }
      }
      if(arr[1] - arr[0] > 3) {
        for(; arr[0]+3 < arr[1]; step++) {
          arr[0] += 2;
        }
      }

      Tuple3 t = new Tuple3(arr[0], arr[1], arr[2]);
      t.step = step;

      bfs(t);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private void bfs(Tuple3 t) {
    Deque<Tuple3> que = new ArrayDeque<>();

    que.offer(t);
System.out.println("[INST]49;None;que.offer(t);"+que.offer(t));

    Tuple3 cur;
    while(!que.isEmpty()) {
System.out.println("[INST]52;None;que.isEmpty();"+que.isEmpty());
      cur = que.poll();
System.out.println("[INST]53;cur;que.poll();"+cur);

      if(cur.isEq()) {
        System.out.println(cur.step);
        return;
      }

      if(cur.e[0] < cur.e[1] && cur.e[0] < cur.e[2]) {
        que.offer(new Tuple3(cur.e[0]+2, cur.e[1], cur.e[2]));
System.out.println("[INST]61;None;que.offer(new Tuple3(cur.e[0]+2, cur.e[1], cur.e[2]));"+que.offer(new Tuple3(cur.e[0]+2, cur.e[1], cur.e[2])));
        que.peekLast().step = cur.step + 1;
System.out.println("[INST]62;None;que.peekLast();"+que.peekLast());
      } else if(cur.e[1] < cur.e[2]) {
        que.offer(new Tuple3(cur.e[0], cur.e[1]+2, cur.e[2]));
System.out.println("[INST]64;None;que.offer(new Tuple3(cur.e[0], cur.e[1]+2, cur.e[2]));"+que.offer(new Tuple3(cur.e[0], cur.e[1]+2, cur.e[2])));
        que.peekLast().step = cur.step + 1;
System.out.println("[INST]65;None;que.peekLast();"+que.peekLast());
      } else {
        que.offer(new Tuple3(cur.e[0], cur.e[1], cur.e[2]+2));
System.out.println("[INST]67;None;que.offer(new Tuple3(cur.e[0], cur.e[1], cur.e[2]+2));"+que.offer(new Tuple3(cur.e[0], cur.e[1], cur.e[2]+2)));
        que.peekLast().step = cur.step + 1;
System.out.println("[INST]68;None;que.peekLast();"+que.peekLast());
      }

      if(cur.e[0] < cur.e[2] && cur.e[1] < cur.e[2]) {
        que.offer(new Tuple3(cur.e[0]+1, cur.e[1]+1, cur.e[2]));
System.out.println("[INST]72;None;que.offer(new Tuple3(cur.e[0]+1, cur.e[1]+1, cur.e[2]));"+que.offer(new Tuple3(cur.e[0]+1, cur.e[1]+1, cur.e[2])));
        que.peekLast().step = cur.step + 1;
System.out.println("[INST]73;None;que.peekLast();"+que.peekLast());
      } else if(cur.e[1] < cur.e[0] && cur.e[2] < cur.e[0]) {
        que.offer(new Tuple3(cur.e[0], cur.e[1]+1, cur.e[2]+1));
System.out.println("[INST]75;None;que.offer(new Tuple3(cur.e[0], cur.e[1]+1, cur.e[2]+1));"+que.offer(new Tuple3(cur.e[0], cur.e[1]+1, cur.e[2]+1)));
        que.peekLast().step = cur.step + 1;
System.out.println("[INST]76;None;que.peekLast();"+que.peekLast());
      } else {
        que.offer(new Tuple3(cur.e[0]+1, cur.e[1], cur.e[2]+1));
System.out.println("[INST]78;None;que.offer(new Tuple3(cur.e[0]+1, cur.e[1], cur.e[2]+1));"+que.offer(new Tuple3(cur.e[0]+1, cur.e[1], cur.e[2]+1)));
        que.peekLast().step = cur.step + 1;
System.out.println("[INST]79;None;que.peekLast();"+que.peekLast());
      }
      
    }
  }

  class Tuple3 {
    int[] e;
    int step;

    public Tuple3(int a, int b, int c) {
      e = new int[3];
      e[0] = a;
      e[1] = b;
      e[2] = c;
      step = 0;
    }

    public boolean isEq() {
      return (e[0] == e[1]) && (e[1] == e[2]);
    }
  }
}