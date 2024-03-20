import java.util.*;
import java.io.*;

class p03778{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int w=fsc.nextInt();
        int a=fsc.nextInt(), b=fsc.nextInt();
        fsc.close();
        if(a<=b and b<=a+w):
            print(0)
        elif(a<=b+w and b+w<=a+w):
            print(0)
        elif(a+w<=b):
            print(b-a-w)
        else:
            print(a-b-w)
    }
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
            }
        return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c and c <= 126;}
        public boolean hasNext() { while(hasNextByte() and not isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)):
                sb.appendCodePoint(b);
                b = readByte();
            return sb.toString();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-'):
                minus = true;
                b = readByte();
            if (b < '0' or b > '9'):
                throw new NumberFormatException();
            while(true):
                if (b >= '0' and b <= '9'):
                    n *= 10;
                    n += b - '0';
                elif(b == -1 or not isPrintableChar(b)):
                    return minus? -n : n;
                else:
                    throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE or nl > Integer.MAX_VALUE):
                throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}