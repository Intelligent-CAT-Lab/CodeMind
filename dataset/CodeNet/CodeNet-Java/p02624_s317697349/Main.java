
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

   private static final String INPUT_FILE_PATH = "";

   static int[] spf;
   static boolean[] composite;

   static void sieve(int n) {
      int sqrtN = (int) Math.sqrt(n);
      for (int i = 2; i <= sqrtN; i++) {
         if (composite[i]) continue;
         spf[i] = i;
         for (int j = i * i; j <= n; j += i) {
            composite[j] = true;
            if (spf[j] == 0) spf[j] = i;
         }
      }
      for (int i = sqrtN + 1; i <= n; i++) {
         if (!composite[i]) spf[i] = i;
      }
   }

   static int numDivisors(int i) {
      int res = 1;
      while (i > 1) {
         int p = spf[i];
         int pow = 0;
         while (i % p == 0) {
            pow++;
            i /= p;
         }
         res *= (pow + 1);
      }
      return res;
   }

   static void solve(InputReader in, PrintWriter out) {
      int n = in.nextInt();

      spf = new int[n + 1];
      composite = new boolean[n + 1];

      spf[1] = 1;
      sieve(n);

      long ans = 0;
      for (int i = 1; i <= n; i++) {
         ans += ((long) i) * numDivisors(i);
      }
      out.println(ans);
   }

   private static class InputReader {
      private BufferedReader br;
      private StringTokenizer st;

      public InputReader(InputStream inputStream) {
         this.br = new BufferedReader(new InputStreamReader(inputStream), 32768);
         this.st = null;
      }

      public String nextToken() {
         while (st == null || !st.hasMoreTokens()) {
            try {
               st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
               throw new RuntimeException(e);
            }
         }
         return st.nextToken();
      }

      public int nextInt() {
         return Integer.parseInt(nextToken());
      }

      public long nextLong() {
         return Long.parseLong(nextToken());
      }

      public double nextDouble() {
         return Double.parseDouble(nextToken());
      }
   }

   public static void main(String[] args) throws Exception {
      InputStream inputStream = INPUT_FILE_PATH.isEmpty()
         ? System.in
         : new FileInputStream(new File(INPUT_FILE_PATH));
      OutputStream outputStream = System.out;

      InputReader inputReader = new InputReader(inputStream);
      PrintWriter printWriter = new PrintWriter(outputStream);

      solve(inputReader, printWriter);

      printWriter.close();
   }

}
