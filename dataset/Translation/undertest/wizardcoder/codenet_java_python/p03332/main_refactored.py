class main:
    import java.io.*;
    import java.util.*;
    
    public class p03332 {
        static final StdIn in = new StdIn();
        static final PrintWriter out = new PrintWriter(System.out);
        static final long M=998244353;
        
        public static void main(String[] args) {
            long n=in.nextLong(), a=in.nextLong(), b=in.nextLong(), k=in.nextLong(), ans=0;
            long[] nck = new long[(int)n+1];
            nck[0]=1;
            for(int i=1; i<=n; ++i)
                nck[i]=nck[i-1]*(n-i+1)%M*modI(i, M)%M;
            for(int i=0; i<=n&&a*i<=k; ++i) {
                if((k-a*i)%b==0&&(k-a*i)/b<=n)
                    ans+=nck[i]*nck[(int)((k-a*i)/b)]%M;
            }
            out.println(ans%M);
            out.close();
        }
        
        static long modI(long a, long m) {
            if((a%=m)<=1)
                return 1;
            return ((1-modI(m%a, a)*m)/a+m)%m;
        }
        
        static class StdIn {
            final private int BUFFER_SIZE = 1 << 16;
            private DataInputStream din;
            private byte[] buffer;
            private int bufferPointer, bytesRead;
            public StdIn() {
                din = new DataInputStream(System.in);
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }
            public StdIn(InputStream in) {
                try{
                    din = new DataInputStream(in);
                } catch(Exception e) {
                    throw new RuntimeException();
                }
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }
            public String next() {
                int c;
                while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
                StringBuilder s = new StringBuilder();
                while (c!= -1)
                {
                    if (c =='' || c == '\n'||c=='\r')
                        break;
                    s.append((char)c);
                    c=read();
                }
                return s.toString();
            }
            public String nextLine() {
                int c;
                while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
                StringBuilder s = new StringBuilder();