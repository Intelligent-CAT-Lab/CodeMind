import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] primaryNumbers = {
      2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
      53, 59, 61, 67 ,71, 73, 79, 83, 89, 97
    };
    
    Map<Integer, Integer> map = new HashMap<>();
    int count = 0;
    
    
    for(int i = 0; i < primaryNumbers.length; i++){
      int n = primaryNumbers[i];
      map.put(n, 0);
      while(n <= N){
        map.put(primaryNumbers[i], N / n + map.get(primaryNumbers[i]));
        n *= primaryNumbers[i];
      }
    }
    
    
    // iとjが4乗、kが2乗
    for(int i = 0; i < primaryNumbers.length; i++){
      if(map.get(primaryNumbers[i]) < 4){
        break;
      }
      for(int j = i + 1; j< primaryNumbers.length; j++){
        if(map.get(primaryNumbers[j]) < 4){
          break;
        }
        for(int k = 0; k < primaryNumbers.length; k++){
          if(map.get(primaryNumbers[k]) < 2){
            break;
          }
          if(j != k && i != k){
            count++;
          }
        }
      }
    }
    
    for(int i = 0; i < primaryNumbers.length; i++){
      if(map.get(primaryNumbers[i]) < 24){
        break;
      }
      for(int j = 0; j < primaryNumbers.length; j++){
        if(map.get(primaryNumbers[j]) < 2){
          break;
        }
        if(i != j){
          count++;
        }
      }
    }
    
    for(int i = 0; i < primaryNumbers.length; i++){
      if(map.get(primaryNumbers[i]) < 14){
        break;
      }
      for(int j = 0; j < primaryNumbers.length; j++){
        if(map.get(primaryNumbers[j]) < 4){
          break;
        }
        if(i != j){
          count++;
        }
      }
    }
    for(int i = 0; i< primaryNumbers.length; i++){
      if(map.get(primaryNumbers[i]) < 74){
        break;
      }
      count++;
    }
    System.out.println(count);
  }
}