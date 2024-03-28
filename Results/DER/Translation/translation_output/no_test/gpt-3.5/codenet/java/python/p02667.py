```python
def main():
    T = input()
    N = len(T)
    
    oneSum = 0
    indexes = []
    i = 0
    while i < N:
        if T[i] == '1':
            length = 0
            j = i
            while j < N:
                if T[j] == '1':
                    length += 1
                    j += 1
                else:
                    break
            if length % 2 == 1:
                indexes.append(i - (oneSum - len(indexes)))
            oneSum += length
            i += length
        i += 1
    
    zeroSum = N - oneSum
    ans = (zeroSum + 1) * (oneSum - len(indexes)) // 2
    
    for i in range(len(indexes)):
        index = indexes[i]
        ans += zeroSum + 1 - (index - i + (1 + i % 2)) // 2
    
    i = oneSum - 1
    while i >= 1:
        ans += (i + 1) // 2
    
    print(ans)


if __name__ == "__main__":
    main()
```
