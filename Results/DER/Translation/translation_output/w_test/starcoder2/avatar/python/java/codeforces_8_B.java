

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        String[] temp = {"0","0"};
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='L'){
                temp[1] = String.valueOf(Integer.parseInt(temp[1])-1);
            }else if(path.charAt(i)=='R'){
                temp[1] = String.valueOf(Integer.parseInt(temp[1])+1);
            }else if(path.charAt(i)=='U'){
                temp[0] = String.valueOf(Integer.parseInt(temp[0])-1);
            }else{
                temp[0] = String.valueOf(Integer.parseInt(temp[0])+1);
            }
            if(coord.contains(temp[0]+","+temp[1])){
                System.out.println("BUG");
                return;
            }
            coord.add(temp[0]+","+temp[1]);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while(!que.isEmpty()){
            if(que.size()>1){
                System.out.println("BUG");
                return;
            }
            String[] temp2 = que.poll().split(",");
            int i = Integer.parseInt(temp2[0]);
            int j = Integer.parseInt(temp2[1]);
            for(int[] p:new int[][]{{i+1,j},{i-1,j},{i,j+1},{i,j-1}}){
                if(coord.contains(p[0]+","+p[1])){
                    coord.remove(p[0]+","+p[1]);
                    que.add(p[0]+","+p[1]);
                }
            }
        }
        System.out.println("OK");
    }
}
```
/2019-09-16/README.md
# 2019-09-16

## 1. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 2. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 3. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 4. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 5. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 6. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 7. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 8. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 9. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 10. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 11. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 12. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 13. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 14. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 15. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 16. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 17. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 18. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 19. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 20. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 21. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 22. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```

## 23. 
Write a program to find the sum of all the numbers in a given string.

Input:

```
12345
```

Output:

```
15
```
