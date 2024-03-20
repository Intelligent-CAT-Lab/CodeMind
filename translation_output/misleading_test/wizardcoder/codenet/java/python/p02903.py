Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3 1 1

Expected output:
113
-16
62

```
import java.util.*;

class p02903 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    //int c[][] = new int[h][w];
    String s1 = "";
    String s2 = "";
    
    for(int j=0; j<w; j++){
      if (j<a) {
        s1 = s1 + "0";
        s2 = s2 + "1";
      } else {
        s1 = s1 + "1";
        s2 = s2 + "0";
      }
    }
    
    for(int i=0; i<h; i++){
        if(i<b) {
          System.out.print(s1);
        } else if (i>=b) {
          System.out.print(s2);
        }
        System.out.print("\n");
    }
    
//    for(int i=0; i<h; i++){
//      for(int j=0; j<w; j++){
//        System.out.print(c[i][j]);
//      }
//      System.out.print("\n");
//    }
    
  }
}

```

### Response:
```python
import java.util.*;

class p02903 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c[][] = new int[h][w];
    String s1 = "";
    String s2 = "";
    
    for(int j=0; j<w; j++){
      if (j<a) {
        s1 = s1 + "0";
        s2 = s2 + "1";
      } else {
        s1 = s1 + "1";
        s2 = s2 + "0";
      }
    }
    
    for(int i=0; i<h; i++){
        if(i<b) {
          System.out.print(s1);
        } else if (i>=b) {
          System.out.print(s2);
        }
        System.out.print("\n");
    }
    
    for(int i=0; i<h; i++){
      for(int j=0; j<w; j++){
        c[i][j] = i+j;
      }
    }
    
    for(int i=0; i<h; i++){
      for(int j=0; j<w; j++){
        System.out.print(c[i][j]);
      }
      System.out.print("\n");
    }
    
  }
}
```

Explanation:

- We first import the necessary java packages and classes.
- We then create a class called `p02903` which contains the `main` method.
- Inside the `main` method, we create a `Scanner` object to read input from the user.
- We then read the values of `h`, `w`, `a`, and `b` from the user using the `next()` method of the `Scanner` class.
- We create a 2D array `c` of size `h` x `w` to store the values of the matrix.
- We then create two strings `s1` and `s2` to store the binary representation of the first and second rows of the matrix, respectively.
- We use a `for` loop to generate the binary representation of the first row of the matrix. We use the `if` statement to determine whether to add a `0` or a `1` to the string.
- We then use another `for` loop to generate the binary representation of the second row of the matrix. We use the `if` statement to determine whether to add a `0` or a `1` to the string.
- We then use another `for` loop to generate the binary representation of the remaining rows of the matrix. We use the `if` statement to determine whether to print the first or second row of the matrix.
- We then use another `for` loop to fill the values of the matrix `c` with the values of the indices of the elements.
- Finally, we use another `for` loop to print the values of the matrix `c`.<|endoftext|>
