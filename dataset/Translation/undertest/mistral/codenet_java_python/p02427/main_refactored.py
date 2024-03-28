class main:
    n = int(input())
    
    for i in range(pow(2, n)):
        temp = i
        print(i, end=":")
        for j in range(temp):
            if temp % 2 == 1:
                print(j, end=" ")
            temp //= 2
        print()