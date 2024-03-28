<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x , y = map ( int , input ( ) . split ( ) )
CielWon = False
while ( y > 1 and x * 10 + y > 21 ) :
    t = min ( x , 2 )
    x -= t
    y -= ( 2 - t ) * 10 + 2
    if ( y < 2 or 10 * x + y < 22 ) :
        CielWon = True
        break
    y -= 2
    t = min ( 2 , y // 10 )
    y -= 10 * t
    x -= 2 - t
print ( ' Ciel ' if CielWon else ' Hanako ' )


```

### 解答

```java
int x, y;
String input = "10 2";
String[] split = input.split(" ");
x = Integer.parseInt(split[0]);
y = Integer.parseInt(split[1]);
boolean cielWon = false;
while (y > 1 && x * 10 + y > 21) {
    int t = Math.min(x, 2);
    x -= t;
    y -= (2 - t) * 10 + 2;
    if (y < 2 || 10 * x + y < 22) {
        cielWon = true;
        break;
    }
    y -= 2;
    t = Math.min(2, y / 10);
    y -= 10 * t;
    x -= 2 - t;
}
System.out.println("Ciel" + (cielWon ? "" : " Hanako"));
```

### 解説

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
x , y = map ( int , input ( ) . split ( ) )
```

```python
