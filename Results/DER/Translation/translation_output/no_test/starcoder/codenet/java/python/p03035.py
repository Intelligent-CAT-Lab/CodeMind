<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03035{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a<=5){
      System.out.println(0);
    }
    else if(a<=12){
      System.out.println((int)(b/2));
    }
    else{
      System.out.println(b);
    }
  }
}
```

python code:<fim_suffix><fim_middle>
```python
import java.util.*;

class p03035{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a<=5):
      System.out.println(0);
    elif(a<=12):
      System.out.println((int)(b/2));
    else:
      System.out.println(b);
  }
}
```
"""
<|endoftext|>
