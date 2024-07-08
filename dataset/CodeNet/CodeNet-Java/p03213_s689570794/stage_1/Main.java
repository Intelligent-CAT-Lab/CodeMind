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
var newVariable_0 = map.put(n, 0);      while(n <= N){
var newVariable_1 = map.put(primaryNumbers[i], N / n + map.get(primaryNumbers[i]));var newVariable_2 = map.get(primaryNumbers[i]);        map.put(primaryNumbers[i], N / n + newVariable_2);
        n *= primaryNumbers[i];
      }
    }
    
    
    // iとjが4乗、kが2乗
    for(int i = 0; i < primaryNumbers.length; i++){
var newVariable_3 = map.get(primaryNumbers[i]);      if(newVariable_3 < 4){
        break;
      }
      for(int j = i + 1; j< primaryNumbers.length; j++){
var newVariable_4 = map.get(primaryNumbers[j]);        if(newVariable_4 < 4){
          break;
        }
        for(int k = 0; k < primaryNumbers.length; k++){
var newVariable_5 = map.get(primaryNumbers[k]);          if(newVariable_5 < 2){
            break;
          }
          if(j != k && i != k){
            count++;
          }
        }
      }
    }
    
    for(int i = 0; i < primaryNumbers.length; i++){
var newVariable_6 = map.get(primaryNumbers[i]);      if(newVariable_6 < 24){
        break;
      }
      for(int j = 0; j < primaryNumbers.length; j++){
var newVariable_7 = map.get(primaryNumbers[j]);        if(newVariable_7 < 2){
          break;
        }
        if(i != j){
          count++;
        }
      }
    }
    
    for(int i = 0; i < primaryNumbers.length; i++){
var newVariable_8 = map.get(primaryNumbers[i]);      if(newVariable_8 < 14){
        break;
      }
      for(int j = 0; j < primaryNumbers.length; j++){
var newVariable_9 = map.get(primaryNumbers[j]);        if(newVariable_9 < 4){
          break;
        }
        if(i != j){
          count++;
        }
      }
    }
    for(int i = 0; i< primaryNumbers.length; i++){
var newVariable_10 = map.get(primaryNumbers[i]);      if(newVariable_10 < 74){
        break;
      }
      count++;
    }
    System.out.println(count);
  }
}