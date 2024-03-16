# No need to import a scanner in Python, we use the input() function instead.

def atcoder_ABC142_A():
    N = int(input())
    sum = 0
    
    for i in range(1, N + 1):
        if i % 2 != 0:
            sum += 1
    
    print(sum / N)

atcoder_ABC142_A()