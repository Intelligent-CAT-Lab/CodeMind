import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String s = scan.next() ;
    char ch[] = s.toCharArray();
    int x = 0 ;
var newVariable_0 = s.length();    for(int i = 0 ; i < newVariable_0 ; i++){
      if(ch[i] == '+')
        x++;
      else if(ch[i]=='-')
        x--;
    }
    System.out.println(x) ;
  }
}
