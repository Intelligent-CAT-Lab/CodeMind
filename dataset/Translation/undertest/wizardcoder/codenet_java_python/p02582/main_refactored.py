class main:
    import java.io.*;
    
    public class p02582 {
    
        public static void main(String[] args) throws IOException {
            PrintWriter prnt = new PrintWriter(System.out);
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    
            String s = read.readLine();
            int res = 0;
            if (s.charAt(0) == 'R' and s.charAt(1) == 'R' and s.charAt(2) == 'R'):
                res = 3;
            elif (s.charAt(0) == 'R' and s.charAt(1) == 'R'):
                res = 2;
            elif (s.charAt(1) == 'R' and s.charAt(2) == 'R'):
                res = 2;
            elif (s.charAt(0) == 'S' and s.charAt(1) == 'S' and s.charAt(2) == 'S'):
                res = 0;
            else:
                res = 1;
    
            prnt.println(res);
            prnt.close();
        }
    }