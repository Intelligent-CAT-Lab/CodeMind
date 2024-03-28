class main:
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.io.PrintWriter;
    import java.util.NoSuchElementException;
    
    /*
                       _ooOoo_
                      o8888888o
                      88". "88
                      (| -_- |)
                      O\  =  /O
                   ____/`---'\____
                .'  \\|     |//  `.
                /  \\|||  :  |||//  \
               /  _||||| -:- |||||-  \
               |   | \\\  -  /// |   |
               | \_|  ''\---/''  |   |
               \ .-\__  `-`  ___/-. /
             ___`..'  /--.--\  `.. __
         ."" '<  `.___\_<|>_/___.'  >'"".
         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
         \  \ `-.   \_ __\ /__ _/  .-` /  /
    ======`-.____`-.___\_____/___.-`____.-'======
                       `=---='
    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                pass System Test!
    */
    
    public class p01811 {
      private static class Task {
        void solve(FastScanner in, PrintWriter out) throws Exception {
          String S = in.next();
          while (S.length() > 3) {
            boolean abc = false;
            for (int i = 0; i + 3 <= S.length(); i++) {
              if (S.substring(i, i