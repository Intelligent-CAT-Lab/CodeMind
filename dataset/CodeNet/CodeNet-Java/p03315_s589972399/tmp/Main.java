import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String s = scan.next() ;
System.out.println("[INST]5;s;scan.next();"+s);
    char ch[] = s.toCharArray();
System.out.println("[INST]6;ch;s.toCharArray();"+ch);
    int x = 0 ;
    for(int i = 0 ; i < s.length() ; i++){
System.out.println("[INST]8;None;s.length();"+s.length());
      if(ch[i] == '+')
        x++;
      else if(ch[i]=='-')
        x--;
    }
    System.out.println(x) ;
  }
}
