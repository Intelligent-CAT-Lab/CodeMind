import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
 
 
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
 
    String str = sc.nextStr();
 
    int batsucount = 0;
var newVariable_0 = str.length();    for(int i = 0; i < newVariable_0; i++){
var newVariable_1 = str.charAt(i);      if(newVariable_1 == 'x'){
        batsucount++;
      }
    }
 
    if(batsucount < 8){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
 
  }
 
 //ここからテンプレ
  static class InputReader {
      private InputStream stream;
      private byte[] buf = new byte[1024];
      private int curChar;
      private int numChars;
      private SpaceCharFilter filter;
 
      public InputReader(InputStream stream) {
          this.stream = stream;
      }
 
      public int next() {
          if (numChars == -1)
              throw new InputMismatchException();
          if (curChar >= numChars) {
              curChar = 0;
              try {
                  numChars = stream.read(buf);
              } catch (IOException e) {
                  throw new InputMismatchException();
              }
              if (numChars <= 0)
                  return -1;
          }
          return buf[curChar++];
      }
 
      public String nextStr() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        StringBuffer str = new StringBuffer();
        do{
var newVariable_2 = str.append((char)c);          c = next();
        }while(!isSpaceChar(c));
var newVariable_3 = str.toString();        return newVariable_3;
      }
 
      public char nextChar() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        char ret;
        do{
          ret = (char)c;
          c = next();
        }while(!isSpaceChar(c));
        return ret;
      }
 
      public int nextInt() {
          int c = next();
          while (isSpaceChar(c))
              c = next();
          int sgn = 1;
          if (c == '-') {
              sgn = -1;
              c = next();
          }
          int res = 0;
          do {
              if (c < '0' || c > '9')
                  throw new InputMismatchException();
              res *= 10;
              res += c - '0';
              c = next();
          } while (!isSpaceChar(c));
          return res * sgn;
      }
 
      public boolean isSpaceChar(int c) {
          if (filter != null)
              return filter.isSpaceChar(c);
          return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
      }
 
      public interface SpaceCharFilter {
          public boolean isSpaceChar(int ch);
      }
  }
}