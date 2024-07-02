public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double a, b, cc;
    double s, l, h;

    a = sc.nextDouble();
System.out.println("[INST]7;a;sc.nextDouble();"+a);
    b = sc.nextDouble();
System.out.println("[INST]8;b;sc.nextDouble();"+b);
    cc = sc.nextDouble();
System.out.println("[INST]9;cc;sc.nextDouble();"+cc);
    cc = Math.toRadians(cc);
System.out.println("[INST]10;cc;Math.toRadians(cc);"+cc);

    s = a * b * Math.sin(cc) / 2.0;
System.out.println("[INST]12;None;Math.sin(cc);"+Math.sin(cc));
    l = a + b + Math.sqrt(a * a + b * b - 2.0 * a * b * Math.cos(cc));
System.out.println("[INST]13;None;Math.sqrt(a * a + b * b - 2.0 * a * b * Math.cos(cc));"+Math.sqrt(a * a + b * b - 2.0 * a * b * Math.cos(cc)));
System.out.println("[INST]13;None;Math.cos(cc);"+Math.cos(cc));
    h = b * Math.sin(cc);
System.out.println("[INST]14;None;Math.sin(cc);"+Math.sin(cc));

    System.out.println(s);
    System.out.println(l);
    System.out.println(h);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}