import java.util.*;
import java.io.*;
class Main{
  static int n;
  static int[][] map;
  static int[] dx = {1, 1, -1, -1};
  static int[] dy = {1, -1, 1, -1};
  static void dfs(int y, int x,int c, boolean first, List<Long> xy){
    if(first)map[y][x] = c%2+1;
    else map[y][x] = map[y][x]*2 + c%2+1;
    
    for(Long l: xy){
      int yy = (int)(l/1000000);
      int xx = (int)(l%1000000);
      for(int i=0;i<4;++i){
        int yyy= y + yy*dy[i];
        int xxx= x + xx*dx[i];
        if(yyy<0 || yyy>=2*n || xxx<0 || xxx>=2*n)continue;
        if(first){
          if(map[yyy][xxx]>0)continue;
          dfs(yyy, xxx, (c+1)%2, first, xy);
        }else{
          if(map[yyy][xxx]>2)continue;
          dfs(yyy, xxx, (c+1)%2, first, xy);
      	}
    	}
  	}
  }
  
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    n = sc.nextInt();
    int d1 = sc.nextInt(), d2=sc.nextInt();
    map = new int[2*n][2*n];
    Map<Integer, Integer> sqrToseed = new HashMap<>();
    for(int i=0;i*i<=200000;++i)sqrToseed.put(i*i, i);
    List<Long> d1xy = new ArrayList<>();
    List<Long> d2xy = new ArrayList<>();
    for(Map.Entry<Integer, Integer> entry: sqrToseed.entrySet()){
      if(sqrToseed.containsKey(d1 - entry.getKey())){
        d1xy.add((long)entry.getValue()*1000000 + sqrToseed.get(d1-entry.getKey()));
      }
      if(sqrToseed.containsKey(d2 - entry.getKey())){
        d2xy.add((long)entry.getValue()*1000000 + sqrToseed.get(d2-entry.getKey()));
      }
    }
    for(int i=0;i<2*n;++i)for(int j=0;j<2*n;++j)if(map[i][j]==0)dfs(i, j, 0, true, d1xy);
    for(int i=0;i<2*n;++i)for(int j=0;j<2*n;++j)if(map[i][j]<3)dfs(i, j, 0, false, d2xy);
    for(int k=3;k<=6;++k){
      int cnt = 0;
      for(int i=0;i<2*n;++i)for(int j=0;j<2*n;++j)if(map[i][j]==k)++cnt;
      if(cnt >=n*n){
        cnt=0;
        PrintWriter out = new PrintWriter(System.out);
        for(int i=0;i<2*n;++i)for(int j=0;j<2*n;++j)if(map[i][j]==k){
          out.println(i+" "+j);
          ++cnt;
          if(cnt==n*n){
            out.flush();
            return;
          }
        }
      }
    }
  }
}