arr = [1, 1, 2, -2, 3, 4, 5] 

def digits_sum(n):
    neg = 1
    if n < 0: n, neg = -1 * n, -1 
    n = [int(i) for i in str(n)]
    n[0] = n[0] * neg
    return sum(n)

result = len(list(filter(lambda x: x > 0, [digits_sum(i) for i in arr])))
print(result)