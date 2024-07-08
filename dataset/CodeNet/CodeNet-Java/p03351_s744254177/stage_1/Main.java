import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
  int a = scan.nextInt();
    int b =scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    
var newVariable_0 = Math.abs(a-c);var newVariable_1 = Math.abs(a-b);var newVariable_2 = Math.abs(b-c);    if(Math.abs(a-c) <= d || (Math.abs(a-b)<= d && newVariable_2<=d) ){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}
