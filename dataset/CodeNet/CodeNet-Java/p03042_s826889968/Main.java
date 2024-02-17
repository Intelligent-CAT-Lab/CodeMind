import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_input = Integer.parseInt(sc.next());
    int number_upper = number_input / 100;
    int number_lower = number_input % 100;
    if((1 <= number_upper && number_upper <= 12) && (1 <= number_lower && number_lower <= 12)) {
      System.out.println("AMBIGUOUS");
    } else if(1 <= number_upper && number_upper <= 12) {
      System.out.println("MMYY");
    } else if(1 <= number_lower && number_lower <= 12) {
      System.out.println("YYMM");
    } else {
      System.out.println("NA");
    }
  }
}
