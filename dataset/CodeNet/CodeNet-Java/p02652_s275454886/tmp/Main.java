import java.util.*;
import java.io.*;

class Main {
  static int solve(char [] s, int minPrefix) {
    int sum = 0, maxPrefix = 0;
    TreeSet <Integer> index = new TreeSet <> ();
    for(int i = 0; i < s.length; i++) {
      if(s[i] == '1') {
        sum += 1;
      } else {
        sum -= 1;
        if(s[i] == '?') {
          index.add(i);
System.out.println("[INST]13;None;index.add(i);"+index.add(i));
          s[i] = '0';
        }
      }
      while(sum < minPrefix) {
        if(index.isEmpty()) return Integer.MAX_VALUE;
System.out.println("[INST]18;None;index.isEmpty();"+index.isEmpty());
        int optIndex = index.last();
System.out.println("[INST]19;optIndex;index.last();"+optIndex);
        index.remove(optIndex);
System.out.println("[INST]20;None;index.remove(optIndex);"+index.remove(optIndex));
        s[optIndex] = '1';
        sum += 2;
      }
    }
    sum = 0;
    for(int i = 0; i < s.length; i++) {
      if(s[i] == '1') {
        sum += 1;
      } else {
        sum -= 1;
      }
      maxPrefix = Math.max(maxPrefix, sum);
System.out.println("[INST]32;maxPrefix;Math.max(maxPrefix, sum);"+maxPrefix);
    }
    return maxPrefix - minPrefix;
  }
  public static void main(String [] args) {
    Reader in = new Reader();
    char [] s = in.next().toCharArray();
    int sum = 0;
    int start = 0;
    for(int i = 0; i < s.length; i++) {
      if(s[i] == '0') sum -= 1;
      else sum += 1;
      start = Math.min(start, sum);
System.out.println("[INST]44;start;Math.min(start, sum);"+start);
    }
    System.out.println(Math.min(solve(s.clone(), start), solve(s.clone(), start - 1)));
  }
}

class Reader {
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer s = new StringTokenizer("");
  Reader () {}
  String nextLine() {
    try {
      return in.readLine();
System.out.println("[INST]56;None;in.readLine();"+in.readLine());
    } catch (Exception e) {
      e.printStackTrace();
      return "Error";
    }
  }
  String next() {
    while(!s.hasMoreTokens()) {
System.out.println("[INST]63;None;s.hasMoreTokens();"+s.hasMoreTokens());
      s = new StringTokenizer(nextLine());
    }
    return s.nextToken();
System.out.println("[INST]66;None;s.nextToken();"+s.nextToken());
  }
  int nextInt() {
    return Integer.parseInt(next());
  }
}

