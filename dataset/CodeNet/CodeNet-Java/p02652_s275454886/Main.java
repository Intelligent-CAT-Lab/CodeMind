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
          s[i] = '0';
        }
      }
      while(sum < minPrefix) {
        if(index.isEmpty()) return Integer.MAX_VALUE;
        int optIndex = index.last();
        index.remove(optIndex);
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
    } catch (Exception e) {
      e.printStackTrace();
      return "Error";
    }
  }
  String next() {
    while(!s.hasMoreTokens()) {
      s = new StringTokenizer(nextLine());
    }
    return s.nextToken();
  }
  int nextInt() {
    return Integer.parseInt(next());
  }
}

