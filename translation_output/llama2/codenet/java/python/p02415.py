<s> Translate the following java code to python and enclose your solution inside ```python```:
```
//8-A
import java.util.Scanner;

class p02415 {
    public static void main(String [] args){
    	
    	Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        
        int num = n.length();
        
        for( int i = 0 ; i < num ; i++ ){
        	
        	if(Character.isLowerCase(n.charAt(i))){
        		
                System.out.print(Character.toUpperCase(n.charAt(i)));
                
            }else if(Character.isUpperCase(n.charAt(i))){
            	
                System.out.print(Character.toLowerCase(n.charAt(i)));
                
            }/*else if( n.charAt(i) == ' '){
            	
            	System.out.print(' ');
            	
            }*/else{
            	
                System.out.print(n.charAt(i));
                
            }
        	
        }
        
        System.out.println();
    }
}
```

### 解答

```python
n = input()

for i in range(len(n)):
    if n[i].islower():
        print(n[i].upper())
    elif n[i].isupper():
        print(n[i].lower())
    else:
        print(n[i])
```

### 解析

1. 首先，我们需要将输入的字符串转换为一个字符串，然后我们可以使用`len()`函数来获取字符串的长度。
2. 然后，我们需要使用`for`循环来遍历字符串，并根据字符的大小写来进行转换。
3. 最后，我们需要使用`print()`函数来输出字符串。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [8-B](/p/8-B)
</s>
