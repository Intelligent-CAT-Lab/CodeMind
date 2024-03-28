class main:
    import java.util.*;
    import java.io.*;
    
    class p02251 {
        void solve () {
            
            int n = nextInt();
            int ans = 0;
            
            //25cent
            ans += n//25;
            n %= 25;
            
            //10cent
            ans += n//10;
            n %= 10;
            
            //5cent
            ans += n//5;
            n %= 5;
            
            //1cent
            ans += n;
            
            out.println(ans);
            
        }
    
    
        // <p02251 Method>
        public static PrintWriter out;
        public static void main(String[] args) {
            out = new PrintWriter(System.out);
            new p02251().solve();
            out.flush();
        }
    
        // <Default Field>
        static int maxInt = Integer.MAX_VALUE, minInt = Integer.MIN_VALUE;
        static int mod = 1000000007;
    
        // <Default Method>
        static int max (int... ar) {Arrays.sort(ar);return ar[ar.length-1];}
        static int min (int... ar) {Arrays.sort(ar);return ar[0];}
        static int calcManhatDistance (int x1, int y1, int x2, int y2) {
            int d = Math.abs(x1-x2)+Math.abs(y1-y2);
            return d;
        }
        static double calcEuclidDistance (double x1, double y1, double x2, double y2) {
            double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
            return d;
        }
        static boolean isPrime (int n) {
            if (n==2) return true;
            if (n<2 || n%2==0) return false;
            double d = Math.sqrt(n);
            for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
            return true;
        }
        static void printChar2DArray (char[][] ar) {
            for (int i=0; i<ar.length; i++) {
                for (int j=0; j<ar[0].length; j++) {
                    out.print(ar[i][j]);
                }
                out.println();
            }
        }
    
        // <Fast Scanner> START -------------------------------------------------
        static