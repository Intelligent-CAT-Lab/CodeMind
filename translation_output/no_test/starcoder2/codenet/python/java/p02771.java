
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b != c) {
            System.out.println("Yes");
        } else if (b == c && a != b) {
            System.out.println("Yes");
        } else if (a == c && a != b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
/docs/python/01-basic/01-basic.md
# Basic

## 1. Print

```python
print("Hello World")
```

## 2. Input

```python
a = input()
```

## 3. Variable

```python
a = 1
b = 2
c = a + b
```

## 4. If

```python
if a == b:
    print("a is equal to b")
elif a > b:
    print("a is greater than b")
else:
    print("a is less than b")
```

## 5. For

```python
for i in range(10):
    print(i)
```

## 6. While

```python
while a < 10:
    print(a)
    a += 1
```

## 7. Function

```python
def add(a, b):
    return a + b

print(add(1, 2))
```

## 8. Class

```python
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def print(self):
        print(self.name, self.age)

p = Person("John", 20)
p.print()
```

## 9. List

```python
a = [1, 2, 3]
print(a[0])
a.append(4)
print(a)
```

## 10. Dictionary

```python
a = {"a": 1, "b": 2}
print(a["a"])
a["c"] = 3
print(a)
```

## 11. Set

```python
a = {1, 2, 3}
print(a)
a.add(4)
print(a)
```

## 12. Tuple

```python
a = (1, 2, 3)
print(a)
```

## 13. String

```python
a = "Hello World"
print(a[0])
print(a[0:5])
print(a.split(" "))
```

## 14. File

```python
f = open("file.txt", "r")
print(f.read())
f.close()
```

```python
f = open("file.txt", "w")
f.write("Hello World")
f.close()
```

## 15. Exception

```python
try:
    a = 1 / 0
except:
    print("Error")
```

## 16. Import

```python
import math

print(math.sqrt(4))
```

## 17. Lambda

```python
a = lambda x: x + 1
print(a(1))
```

## 18. Map

```python
a = [1, 2, 3]
b = list(map(lambda x: x + 1, a))
print(b)
```

## 19. Filter

```python
a = [1, 2, 3]
b = list(filter(lambda x: x > 1, a))
print(b)
```

## 20. Reduce

```python
from functools import reduce

a = [1, 2, 3]
b = reduce(lambda x, y: x + y, a)
print(b)
```

## 21. List Comprehension

```python
a = [1, 2, 3]
b = [x + 1 for x in a]
print(b)
```

## 22. Generator

```python
def gen():
    for i in range(10):
        yield i

for i in gen():
    print(i)
```

## 23. Decorator

```python
def decorator(func):
    def wrapper():
        print("Before")
        func()
        print("After")
    return wrapper

@decorator
def func():
    print("Hello World")

func()
```

## 24. Thread

```python
import threading

def func():
    print("Hello World")

t = threading.Thread(target=func)
t.start()
```

## 25. Process

```python
import multiprocessing

def func():
    print("Hello World")

p = multiprocessing.Process(target=func)
p.start()
```

## 26. Socket

```python
import socket

s = socket.socket()
s.bind(("localhost", 8080))
s.listen(5)

while True:
    c, addr = s.accept()
    print("Connected")
    c.send("Hello World".encode())
    c.close()
```

```python
import socket

s = socket.socket()
s.connect(("localhost", 8080))
print(s.recv(1024).decode())
s.close()
```

## 27. Asyncio

```python
import asyncio

async def func():
    print("Hello World")

asyncio.run(func())
```

## 28. Gevent

```python
import gevent

def func():
    print("Hello World")

gevent.spawn(func).join()
```

## 29. Asyncio HTTP Server

```python
import asyncio
from aiohttp import web

async def handle(request):
    return web.Response(text="Hello World")

app = web.Application()
app.add_routes([web.get("/", handle)])

asyncio.run(app.run_until_complete())
```

## 30. Asyncio HTTP Client

```python
import asyncio
import aiohttp

async def func():
    async with aiohttp.ClientSession() as session:
        async with session.get("http://localhost:8080") as resp:
            print(await resp.text())

asyncio.run(func())
```

## 31. Gevent HTTP Server

```python
from gevent import pywsgi

def handle(environ, start_response):
    start_response("200 OK", [("Content-Type", "text/plain")])
    return ["Hello World"]

server = pywsgi.WSGIServer(("localhost", 8080), handle)
server.serve_forever()
```

## 32. Gevent HTTP Client

```python
from gevent import pywsgi

def handle(environ, start_response):
    start_response("200 OK", [("Content-Type", "text/plain")])
    return ["Hello World"]

server = pywsgi.WSGIServer(("localhost", 8080), handle)
server.serve_forever()
```

## 33. Gevent HTTP Client

```python
import gevent
from gevent import pywsgi

def handle(environ, start_response):
    start_response("200 OK", [("Content-Type", "text/plain")])
    return ["Hello World"]

server = pywsgi.WSGIServer(("localhost", 8080), handle)
server.serve_forever()
```

## 34. Gevent HTTP Client

```python
import gevent
from gevent import pywsgi

def handle(environ, start_response):
    start_response("200 OK", [("Content-Type", "text/plain")])
    return ["Hello World"]

server = pywsgi.WSGIServer(("localhost", 8080), handle)
