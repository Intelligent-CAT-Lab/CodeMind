public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double d, i;
    d = sc.nextDouble();
    if(d < 1)out.println(d * Math.sqrt(2));
var newVariable_0 = Math.sqrt(2);    else if(d < newVariable_0)out.println("2");
    else if(d < 2)out.println(d * Math.sqrt(2));
var newVariable_1 = Math.sqrt(2);    else if(d < newVariable_1 * 1.5)out.println("3");
    else out.println(d * Math.sqrt(2));

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}