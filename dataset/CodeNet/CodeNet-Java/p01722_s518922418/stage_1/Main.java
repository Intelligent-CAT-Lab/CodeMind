public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    out.println(solve(sc.nextInt()));

    sc.close();
  }
  private static int solve(int n){
    if(n == 0)return 1;
    if(n == 1)return 2;
    if(n == 2)return 1;
    return 0;
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}