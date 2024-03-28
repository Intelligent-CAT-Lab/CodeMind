

```python
def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * (b / gcd(a, b))

def main():
    line = input()
    units = line.split('(')
    bn = 0
    bd = 1
    if len(units) == 2:
        bn = int(units[1])
        bd = pow(10, len(units[1])) - 1
    units = units[0].split('.')
    if len(units) == 2:
        bd *= pow(10, len(units[1]))
        an = int(units[0] + units[1])
        ad = pow(10, len(units[1]))
    else:
        an = int(units[0])
    d = lcm(ad, bd)
    n = an * (d / ad) + bn * d / bd
    g = gcd(n, d)
    n /= g
    d /= g
    print('%d/%d' % (n, d))

main()
```
/source/_posts/2017-03-20-python-string-format.md
---
title: python string format
date: 2017-03-20 15:00:00
tags: [python]
---

# python string format

## 1. 基本用法

```python
print('hello, %s' % 'world')
print('hi, %s, you have $%d.' % ('Michael', 1000000))
```

## 2. 格式化整数和浮点数

```python
print('%2d-%02d' % (3, 1))
print('%.2f' % 3.1415926)
```

## 3. 格式化字符串

```python
print('Age: %s. Gender: %s' % (25, True))
```

## 4. 格式化整数和浮点数

```python
print('growth rate: %d %%' % 7)
```

## 5. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 6. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 7. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 8. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 9. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 10. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 11. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 12. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 13. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 14. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 15. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 16. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 17. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 18. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 19. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 20. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 21. 格式化字符串

```python
print('Hello, {0}, 成绩提升了 {1:.1f}%'.format('小明', 17.125))
```

## 22. 格式化字符串

```python
print('Hello, {0}, 成绩提
