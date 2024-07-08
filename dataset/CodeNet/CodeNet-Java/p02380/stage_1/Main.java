public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double a, b, cc;
    double s, l, h;

    a = sc.nextDouble();
    b = sc.nextDouble();
    cc = sc.nextDouble();
    cc = Math.toRadians(cc);

var newVariable_0 = Math.sin(cc);    s = a * b * newVariable_0 / 2.0;
var newVariable_1 = Math.sqrt(a * a + b * b - 2.0 * a * b * Math.cos(cc));var newVariable_2 = Math.cos(cc);    l = a + b + Math.sqrt(a * a + b * b - 2.0 * a * b * newVariable_2);
var newVariable_3 = Math.sin(cc);    h = b * newVariable_3;

    System.out.println(s);
    System.out.println(l);
    System.out.println(h);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}