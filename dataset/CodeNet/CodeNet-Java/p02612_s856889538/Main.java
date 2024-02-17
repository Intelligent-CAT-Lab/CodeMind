import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      	int n = Integer.parseInt(line);
      
      	int x = n % 1000;
      	int answer = 0;
      	if(x > 0){
          answer = 1000 - x;
        }
      System.out.println(String.valueOf(answer));
    }
}