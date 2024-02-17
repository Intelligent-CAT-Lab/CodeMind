n = int(eval(input()))


while 1:
    prime_dc = 0
    for i in range(2,n):
        if n % i != 0:
            prime_dc += 1
            
    if n-2 == prime_dc:
        break
    
    n += 1

print(n)