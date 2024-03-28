
```python
import sys

def main():
    # Your code here!
    str = input()
    n = len(str)
    p = 2019
    ans = 0
    d = [0] * (n + 1)
    ten = 1
    for i in range(n - 1, -1, -1):
        a = ((ord(str[i]) - ord('0')) * ten) % p
        d[i] = (d[i + 1] + a) % p
        ten = (ten * 10) % p
    map = {}
    for i in range(n + 1):
        key = d[i]
        if key not in map:
            map[key] = 1
        else:
            map[key] += 1
    for key in map:
        val = map[key]
        ans += val * (val - 1) // 2
    print(ans)

if __name__ == '__main__':
    main()
```

## 02703

## 02704

## 02705

## 02706

## 02707

## 02708

## 02709

## 02710

## 02711

## 02712

## 02713

## 02714

## 02715

## 02716

## 02717

## 02718

## 02719

## 02720

## 02721

## 02722

## 02723

## 02724

## 02725

## 02726

## 02727

## 02728

## 02729

## 02730

## 02731

## 02732

## 02733

## 027
