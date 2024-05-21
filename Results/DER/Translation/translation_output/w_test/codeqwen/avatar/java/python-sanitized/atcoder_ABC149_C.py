def find_next_prime(n):
    prime = n
    mid = prime // 2
    flag = False
    
    while True:
        for i in range(2, mid + 1):
            if prime % i == 0:
                flag = True
                break
        
        if not flag:
            break
        else:
            flag = False
        
        prime += 1
    
    return prime

n = int(input())
print(find_next_prime(n))