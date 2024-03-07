<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

g = [None]*50
h = [None]*50
h[1] = 3
g[1] = 6
X= int(input())
for i in range(2, X+1):
    h[i] = g[i-1] + 1
    g[i] = 2*h[i]
print(g[X])


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
int[] g = new int[50];
int[] h = new int[50];
h[1] = 3;
g[1] = 6;
int X = Integer.parseInt(input("Enter a number: "));
for (int i = 2; i <= X; i++) {
    h[i] = g[i - 1] + 1;
    g[i] = 2 * h[i];
}
System.out.println(g[X]);
```
Note that in Java, we use `Integer.parseInt()` to convert a string to an integer, and we use `System.out.println()` to print the result to the console. Also, in Java, we use `int[]` to declare an array of integers, and we use `new int[50]` to create a new array with 50 elements.</s>
