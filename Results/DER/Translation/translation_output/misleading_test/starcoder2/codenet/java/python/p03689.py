

```python
import sys

r, c, h, w = map(int, input().split())

if r % h == 0 and c % w == 0:
    print("No")
    sys.exit()

mcnt = (r // h) * (c // w)
space = r * c - ((r // h) * h) * ((c // w) * w)

plus_number = ((mcnt + space) // space) + 1
minus_number = -(plus_number * (h * w - 1) + 1)

print("Yes")
for i in range(r):
    for j in range(c):
        num = plus_number if (i + 1) % h == 0 and (j + 1) % w == 0 else minus_number
        if j >= 1:
            print(' ', end='')
        print(num, end='')
    print()

```

## 03690 - 03699

## 03700 - 03709

## 03710 - 03719

## 03720 - 03729

## 03730 - 03739

## 03740 - 03749

## 03750 - 03759

## 03760 - 03769

## 03770 - 03779

## 03780 - 03789

## 03790 - 03799

## 03800 - 03809

## 03810 - 03819

## 03820 - 03829

## 03830 - 03839

## 03840 - 03849

## 03850 - 03859

## 03860 - 03869

## 03870 - 03879

## 03880 - 03889

## 03890 - 03899

## 03900 - 03909

## 03910 - 03919

## 03920 - 03929

## 03930 - 03939

## 03940 -
