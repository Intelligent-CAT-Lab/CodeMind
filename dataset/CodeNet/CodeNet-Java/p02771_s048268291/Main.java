import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
      
      	for(int i = 0 ; i < 3 ; i++){
      		set.add(sc.nextInt());
        }

        System.out.println(set.size() == 2 ? "Yes" : "No");
    }
}