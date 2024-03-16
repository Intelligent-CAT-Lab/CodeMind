def atcoder_ABC070_B():
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    array = [0] * 101
    
    for i in range(a, b):
        array[i] += 1
    
    for i in range(c, d):
        array[i] += 1
    
    ans = sum(1 for i in array if i == 2)
    
    print(ans)

# Call the function
atcoder_ABC070_B()