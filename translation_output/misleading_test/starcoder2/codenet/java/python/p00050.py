

```python
str = input()
ans = str.replace("apple", "wwwp")
ans = ans.replace("peach", "wwwa")
ans = ans.replace("wwwp", "peach")
ans = ans.replace("wwwa", "apple")
print(ans)
```

## 5.10

(1)

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True
```

(2)

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True
```

(3)

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def is_prime_list(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list
```

(4)

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def is_prime_list(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_2(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list
```

(5)

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def is_prime_list(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_2(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_3(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list
```

(6)

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def is_prime_list(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_2(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_3(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_4(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list
```

(7)

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def is_prime_list(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_2(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_3(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_4(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_5(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list
```

(8)

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def is_prime_list(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_2(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_3(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_4(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_5(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_6(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list
```

(9)

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def is_prime_list(n):
    prime_list = []
    for i in range(1, n + 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

def is_prime_list_2(n):
    prime_list = []
