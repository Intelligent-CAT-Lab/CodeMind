def atcoder_ABC142_A():
    N = int(input())
    sum = 0
    
    for i in range(1, N+1):
        if i % 2 != 0:
            sum += 1
        
    print(sum / N)

if __name__ == "__main__":
    atcoder_ABC142_A()