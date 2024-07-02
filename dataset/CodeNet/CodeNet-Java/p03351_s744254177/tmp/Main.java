import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
  int a = scan.nextInt();
System.out.println("[INST]5;a;scan.nextInt();"+a);
    int b =scan.nextInt();
System.out.println("[INST]6;b;scan.nextInt();"+b);
    int c = scan.nextInt();
System.out.println("[INST]7;c;scan.nextInt();"+c);
    int d = scan.nextInt();
System.out.println("[INST]8;d;scan.nextInt();"+d);
    
    if(Math.abs(a-c) <= d || (Math.abs(a-b)<= d && Math.abs(b-c)<=d) ){
System.out.println("[INST]10;None;Math.abs(a-c);"+Math.abs(a-c));
System.out.println("[INST]10;None;Math.abs(a-b);"+Math.abs(a-b));
System.out.println("[INST]10;None;Math.abs(b-c);"+Math.abs(b-c));
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}
