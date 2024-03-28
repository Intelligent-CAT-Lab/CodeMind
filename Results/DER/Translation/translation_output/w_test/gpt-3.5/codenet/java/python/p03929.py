```python
def solve():
    one = nextIntArray()
    N = one[0]
    d = one[1]
    if N <= 2:
        myout(0)
        return
    N -= 3
    loop = N // 11
    amari = N % 11
    map = [[1,1,1,2,2,3,4,4,5,5,5], [0,1,2,2,3,3,3,4,4,4,5], [1,1,1,2,2,2,3,3,4,5,5],
           [0,0,1,1,2,3,3,4,4,4,5], [1,2,2,3,3,3,4,4,4,5,5], [0,0,1,1,1,2,2,3,4,4,5],
           [0,1,1,2,3,3,4,4,4,5,5], [1,1,2,2,2,3,3,3,4,4,5], [0,1,1,1,2,2,3,4,4,5,5],
           [1,1,2,3,3,4,4,4,5,5,5], [0,1,1,1,2,2,2,3,3,4,5]]
    myout(loop * 5 + map[d][amari])

# Required utility functions
def nextIntArray():
    input_line = input().split()
    return [int(num) for num in input_line]

def myout(message):
    print(message)


# Test input processing
solve()
```

