import java.io.*;
import java.util.*;

class p03423:
  def main(self):
    br = BufferedReader(InputStreamReader(System.in))
    l = br.readLine()
    st = StringTokenizer(l)
    answer = int(Math.floor(int(st.nextToken())/3))
    System.out.println(answer)

p03423().main()