import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String s = scan.next() ;
    char ch[] = s.toCharArray();
    int x = 0 ;
    for(int i = 0 ; i < s.length() ; i++){
      if(ch[i] == '+')
        x++;
      else if(ch[i]=='-')
        x--;
    }
    System.out.println(x) ;
  }
}
