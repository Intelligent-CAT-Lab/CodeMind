public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double d, i;
    d = sc.nextDouble();
System.out.println("[INST]4;d;sc.nextDouble();"+d);
    if(d < 1)out.println(d * Math.sqrt(2));
    else if(d < Math.sqrt(2))out.println("2");
System.out.println("[INST]6;None;Math.sqrt(2);"+Math.sqrt(2));
    else if(d < 2)out.println(d * Math.sqrt(2));
    else if(d < Math.sqrt(2) * 1.5)out.println("3");
System.out.println("[INST]8;None;Math.sqrt(2);"+Math.sqrt(2));
    else out.println(d * Math.sqrt(2));

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}