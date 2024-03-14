import java.io.*;
import java.util.*;

public class p03097 {
  private static int dropBit(int n, int index) {
    int higher = (n >> (index + 1)) << index;
    int lower = (n & ((1 << index) - 1));
//    System.err.printf("n: %d, index: %d, higher: %d, lower: %d\n", n, index, higher, lower);
    return higher | lower;
  }
  
  private static int insertBit(int n, int index, int v) {
    int higher = ((n >> index) << (index + 1));
    int lower = (n & ((1 << index) - 1));
    return higher | lower | v;
  }
  
  private static List<Integer> solveSub(int n, int a, int b) {
//    System.err.printf("n: %d, a: %d, b: %d\n", n, a, b);
    if (n == 1) {
      if (a!= b) {
        return Arrays.asList(a, b);
      } else {
        return null;
      }
    }
    
    for (int i = 0; i < n; i++) {
      int aBit = (a >> i) & 1;
      int bBit = (b >> i) & 1;
      if (aBit!= bBit) {
        int aDash = dropBit(a, i);
        int bDash = dropBit(b, i);
//        System.err.printf("i: %d, aDash: %d, bDash: %d\n", i, aDash, bDash);
        int c = aDash ^ 1;
        List<Integer> path1 = solveSub(n - 1, aDash, c);
        List<Integer> path2 = solveSub(n - 1, c, bDash);
        if (path1!= null && path2!= null) {
          List<Integer> path = new ArrayList<>();
          for (int v : path1) {
            path.add(insertBit(v, i, aBit << i));
          }
          for (int v : path2) {
            path.add(insertBit(v, i, bBit << i));
          }
          return path;
        }
        return null;
      }
    }
    return null;
  }
  
  private static List