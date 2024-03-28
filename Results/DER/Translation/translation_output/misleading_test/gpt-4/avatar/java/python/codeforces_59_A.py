Here is the equivalent Python code for the Java code snippet provided above:

```python
word = input()
uppercase = sum(1 for ch in word if ch.isupper())
lowercase = sum(1 for ch in word if ch.islower())

if uppercase > lowercase:
    print(word.upper())
else:
    print(word.lower())
```

You can test this Python code using the provided sample input:

Test input:
```
CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz
```

Expected output:
```
VS?Z]#CVVVH@y@VB=?HO-7(152g1JC~(MyQ0^oWWw]xVx&uO2N#oUVgiDQwK^M;?9TcYuTlq4SQ.cj:|+qlxpsp[PmW .k`NWT'
```

Please note that this Python implementation assumes that the input is provided correctly and the program is run in an environment that accepts input from the standard input stream (such as a console or terminal).
