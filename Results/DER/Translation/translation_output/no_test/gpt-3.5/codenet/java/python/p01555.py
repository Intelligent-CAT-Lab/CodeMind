```python
def count(s):
    p = 1
    cnt = 1
    res = 0
     
    while p * 10 < s:
        less3 =  (p * 10 - 1)//3 - (p - 1)//3
        less5 =  (p * 10 - 1)//5 - (p - 1)//5
        less15 = (p * 10 - 1)//15 - (p - 1)//15
         
        res += ((p * 10 - 1) - (p - 1) - less3 - less5 + less15) * cnt
        res += (less3 - less15) * 4
        res += (less5 - less15) * 4
        res += less15 * 8
         
        cnt += 1
        p *= 10
     
    less3 =  (s - 1)//3 - (p - 1)//3
    less5 =  (s - 1)//5 - (p - 1)//5
    less15 = (s - 1)//15 - (p - 1)//15
     
    res += ((s - 1) - (p - 1) - less3 - less5 + less15) * cnt
    res += (less3 - less15) * 4
    res += (less5 - less15) * 4
    res += less15 * 8
     
    return res

def main():
    s = int(input())
     
    upper = s
    lower = 1
     
    while upper - lower > 1:
        med = (upper + lower)//2
        dist = count(med)
         
        if dist > s:
            upper = med
        elif dist < s:
            lower = med
        else:
            upper = med
            lower = med-1
     
    for i in range(lower, lower + 20):
        if i % 15 == 0:
            print("FizzBuzz")
        elif i % 5 == 0:
            print("Buzz")
        elif i % 3 == 0:
            print("Fizz")
        else:
            print(i)

if __name__ == "__main__":
    main()
```
