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
      if (a != b) {
        return Arrays.asList(a, b);
      } else {
        return null;
      }
    }
    
    for (int i = 0; i