<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=input().split()

if a=='H':
  print(b)
else:
  if b=='H':
    print('D')
  else:
    print('H')
```

### Solution

```java
String a,b;
Scanner sc = new Scanner(System.in);
a = sc.nextLine();
b = sc.nextLine();

if(a.equals("H")){
  System.out.println(b);
}
else{
  if(b.equals("H")){
    System.out.println("D");
  }
  else{
    System.out.println("H");
  }
}
```
</s>
