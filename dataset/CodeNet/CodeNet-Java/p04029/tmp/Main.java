import java.util.Scanner;

class Main{

  public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    int n = sc.nextInt();
System.out.println("[INST]8;n;sc.nextInt();"+n);
    for(int i = 1;i<=n;i++){
    sum = sum + i;
    }
    System.out.println(sum);
  }

}