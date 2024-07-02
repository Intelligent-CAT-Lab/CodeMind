import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
    int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
    int count = 0;
    for (int i = a; i <= b; i++) {
      int[] array = new int[5];
      array[0] = i % 10;
      array[1] = i / 10 % 10;
      array[2] = i / 100 % 10;
      array[3] = i / 1000 % 10;
      array[4] = i / 10000 % 10;
      if (array[0] == array[4] && array[1] == array[3]) {
        count++;
      }
    }
    System.out.println(count);
  }
}