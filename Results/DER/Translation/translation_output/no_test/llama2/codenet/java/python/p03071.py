<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*; 
class p03071 {
   public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int c = 0;
     
      for(int i = 0;i<2;i++){
       if(A>=B){c += A;A = A -1;}
        else{c += B;B = B -1;}
      }
       
     
     
     System.out.print(c);


   }
}

```

### 解答

```python
import java.util

class p03071:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        A = sc.nextInt()
        B = sc.nextInt()
        c = 0
        for i in range(2):
            if A >= B:
                c += A
                A -= 1
            else:
                c += B
                B -= 1
        print(c)

```

### 解析

1. 将java的import语句转换为python的import语句

    ```python
    import java.util
    ```

2. 将java的类转换为python的类

    ```python
    class p03071:
    ```

3. 将java的main方法转换为python的main方法

    ```python
    def main(self, args):
    ```

4. 将java的scanner转换为python的scanner

    ```python
    sc = java.util.Scanner(System.in)
    ```

5. 将java的A转换为python的A

    ```python
    A = sc.nextInt()
    ```

6. 将java的B转换为python的B

    ```python
    B = sc.nextInt()
    ```

7. 将java的c转换为python的c

    ```python
    c = 0
    ```

8. 将java的for循环转换为python的for循环

    ```python
    for i in range(2):
    ```

9. 将java的if语句转换为python的if语句

    ```python
    if A >= B:
    ```

10. 将java的c += A转换为python的c += A

    ```python
    c += A
    ```

11. 将java的A = A -1转换为python的A = A -1

    ```python
    A = A -1
    ```

12. 将java的else语句转换为python的else语句

    ```python
    else:
    ```

13. 将java的c += B转换为python的c += B

    ```python
    c += B
    ```

14. 将java的B = B -1转换为python的B = B -1

    ```python
    B = B -1
    ```

15. 将java的print语句转换为python的print语句

    ```python
    print(c)
    ```

### 总结

1. 将java的import语句转换为python的import语句

    ```python
    import java.util
    ```

2. 将java的类转换为python的类

    ```python
    class p03071:
    ```

3. 将java的main方法转换为python的main方法

    ```python
    def main(self, args):
    ```

4. 将java的scanner转换为python的scanner

    ```python
    sc = java.util.Scanner(System.in)
    ```

5. 将java的A转换为python的A

    ```python
    A = sc.nextInt()
    ```

6. 将java的B转换为python的B

    ```python
    B = sc.nextInt()
    ```

7. 将java的c转换为python的c

    ```python
    c = 0
    ```

8. 将java的for循环转换为python的for循环

    ```python
    for i in range(2):
    ```

9. 将java的if语句转换为python的if语句

    ```python
    if A >= B:
    ```

10. 将java的c += A转换为python的c += A

    ```python
    c += A
    ```

11. 将java的A = A -1转换为python的A = A -1

    ```python
    A = A -1
    ```

12. 将java的else语句转换为python的else语句

    ```python
    else:
    ```

13. 将java的c += B转换为python的c += B

    ```python
    c += B
    ```

14. 将java的B = B -1转换为python的B = B -1

    ```python
    B = B -1
    ```

15. 将java的print语句转换为python的print语句

    ```python
    print(c)
    ```

### 参考

1. [Java to Python](https://www.geeksforgeeks.org/java-to-python/)
</s>
