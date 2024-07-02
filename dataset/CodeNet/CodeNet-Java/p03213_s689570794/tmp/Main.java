import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
System.out.println("[INST]4;N;sc.nextInt();"+N);
    int[] primaryNumbers = {
      2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
      53, 59, 61, 67 ,71, 73, 79, 83, 89, 97
    };
    
    Map<Integer, Integer> map = new HashMap<>();
    int count = 0;
    
    
    for(int i = 0; i < primaryNumbers.length; i++){
      int n = primaryNumbers[i];
      map.put(n, 0);
System.out.println("[INST]16;None;map.put(n, 0);"+map.put(n, 0));
      while(n <= N){
        map.put(primaryNumbers[i], N / n + map.get(primaryNumbers[i]));
System.out.println("[INST]18;None;map.put(primaryNumbers[i], N / n + map.get(primaryNumbers[i]));"+map.put(primaryNumbers[i], N / n + map.get(primaryNumbers[i])));
System.out.println("[INST]18;None;map.get(primaryNumbers[i]);"+map.get(primaryNumbers[i]));
        n *= primaryNumbers[i];
      }
    }
    
    
    // iとjが4乗、kが2乗
    for(int i = 0; i < primaryNumbers.length; i++){
      if(map.get(primaryNumbers[i]) < 4){
System.out.println("[INST]26;None;map.get(primaryNumbers[i]);"+map.get(primaryNumbers[i]));
        break;
      }
      for(int j = i + 1; j< primaryNumbers.length; j++){
        if(map.get(primaryNumbers[j]) < 4){
System.out.println("[INST]30;None;map.get(primaryNumbers[j]);"+map.get(primaryNumbers[j]));
          break;
        }
        for(int k = 0; k < primaryNumbers.length; k++){
          if(map.get(primaryNumbers[k]) < 2){
System.out.println("[INST]34;None;map.get(primaryNumbers[k]);"+map.get(primaryNumbers[k]));
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
System.out.println("[INST]45;None;map.get(primaryNumbers[i]);"+map.get(primaryNumbers[i]));
        break;
      }
      for(int j = 0; j < primaryNumbers.length; j++){
        if(map.get(primaryNumbers[j]) < 2){
System.out.println("[INST]49;None;map.get(primaryNumbers[j]);"+map.get(primaryNumbers[j]));
          break;
        }
        if(i != j){
          count++;
        }
      }
    }
    
    for(int i = 0; i < primaryNumbers.length; i++){
      if(map.get(primaryNumbers[i]) < 14){
System.out.println("[INST]59;None;map.get(primaryNumbers[i]);"+map.get(primaryNumbers[i]));
        break;
      }
      for(int j = 0; j < primaryNumbers.length; j++){
        if(map.get(primaryNumbers[j]) < 4){
System.out.println("[INST]63;None;map.get(primaryNumbers[j]);"+map.get(primaryNumbers[j]));
          break;
        }
        if(i != j){
          count++;
        }
      }
    }
    for(int i = 0; i< primaryNumbers.length; i++){
      if(map.get(primaryNumbers[i]) < 74){
System.out.println("[INST]72;None;map.get(primaryNumbers[i]);"+map.get(primaryNumbers[i]));
        break;
      }
      count++;
    }
    System.out.println(count);
  }
}