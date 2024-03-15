解析


import java.io.*;
import java.util.*;
 
 
public class p03421 implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);

    int n = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    calc(n, a, b);
  }

  StringBuilder output = new StringBuilder();

  public void calc(int n, int a, int b) {
    for (int i = n - a + 1 ; i <= n ; i ++) {
      output.append(i).append(" ");
    }
    int rest = n - a - b + 1;
    if (rest < 0) {
      System.out.println(-1);
      return;
    } else if (rest >= 1) {
      if (!calcInner(rest, a - 1, b - 1)) {
        System.out.println(-1);
        return;
      }
    }
    for (int i = n - a ; i >= rest + 1 ; i --) {
      output.append(i).append(" ");
    }
    output.deleteCharAt(output.length() - 1);
    System.out.println(output);
  }

  public boolean calcInner(int n, int a, int b) {
    StringBuilder first = new StringBuilder();
    StringBuilder second = new StringBuilder();
    while (true) {
      if (a <= 0 || b <= 0) {
        return false;
      }
      int firstI = (n - a + 1 >= 1) ? n - a + 1 : 1;
      for (int i = firstI ; i <= n ; i ++) {
        first.append(i).append(" ");
      }
      int rest = n - a - b + 1;
      int endI = (rest + 1 >= 1) ? rest + 1 : 1;
      StringBuilder subSecond = new StringBuilder();
      for (int i = firstI - 1 ; i >= endI ; i --) {
        subSecond.append(i).append(" ");
      }
      second.insert(0, subSecond);
      if (rest <= 0) {
        output.append(first);
        output.append(second);
        return true;
      } else {
        n = rest;
        a --; b --;
      }
    }
  }
 
  public static void main(String[] args) {
    p03421 main = new p03421();
    main.run();
  }
 
  // scanner slightly faster than usual ones
  public static class