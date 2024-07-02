import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String n = sc.next();
System.out.println("[INST]9;n;sc.next();"+n);
    char[] digit = n.toCharArray();
System.out.println("[INST]10;digit;n.toCharArray();"+digit);

    int total = 0;
    for(int i = 0; i< digit.length; i++){
      total += Character.getNumericValue(digit[i]);
System.out.println("[INST]14;total;Character.getNumericValue(digit[i]);"+total);
    }

    if(total % 9 == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

    return;

  }
}