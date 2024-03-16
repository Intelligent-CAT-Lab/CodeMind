```python
def main():
    S = input()
    if len(S) == 1:
        print(S)
        return
    N = [int(x) for x in S]

    patternCount = 1
    tmpBit = ""
    for i in range(len(N)):
        if i > 0:
            patternCount *= 2
            tmpBit += "1"

    sum_val = 0
    for i in range(patternCount):
        bin_val = bin(i)[2:].zfill(len(tmpBit))
        add = str(N[0])
        for j in range(len(bin_val)):
            if bin_val[j] == '1':
                sum_val += int(add)
                add = ""
            add += str(N[j+1])
        
        if len(add) > 0:
            sum_val += int(add)
    
    print(sum_val)

if __name__ == "__main__":
    main()
```
