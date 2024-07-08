import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String n = sc.next();
    char[] digit = n.toCharArray();

    int total = 0;
    for(int i = 0; i< digit.length; i++){
      total += Character.getNumericValue(digit[i]);
    }

    if(total % 9 == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

    return;

  }
}