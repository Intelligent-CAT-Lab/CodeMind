import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int k = 0;
    if(400 <= x && x < 600) k = 8;
    else if(600 <= x && x < 800) k = 7;
    else if(800 <= x && x < 1000) k = 6;
    else if(1000 <= x && x < 1200) k = 5;
    else if(1200 <= x && x < 1400) k = 4;
    else if(1400 <= x && x < 1600) k = 3;
    else if(1600 <= x && x < 1800) k = 2;
    else if(1800 <= x && x <= 1999) k = 1;
    System.out.println(k);
  }
}