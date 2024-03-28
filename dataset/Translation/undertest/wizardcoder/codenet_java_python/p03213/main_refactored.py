class main:
    import math
    
    def factorization(n):
        list = []
        tmp = n
        for i in range(2, int(math.sqrt(n))+1):
            if tmp % i == 0:
                cnt = 0
                while tmp % i == 0:
                    cnt += 1
                    tmp //= i
                list.append([i, cnt])
        if tmp!= 1:
            list.append([tmp, 1])
        if not list:
            list.append([n, 1])
        return list
    
    def add_map(x, y):
        if x in map:
            map[x] += y
        else:
            map[x] = y
    
    N = int(input())
    map = {}
    for i in range(2, N+1):
        for array in factorization(i):
            add_map(array[0], array[1])
    
    values = list(map.values())
    values.sort(reverse=True)
    
    ans = 0
    for value in values:
        if value >= 74:
            ans += 1
    
    for value in values:
        if value >= 24:
            for value2 in values:
                if value2 >= 2 and value!= value2:
                    ans += 1
    
    for value in values:
        if value >= 14:
            for value2 in values:
                if value2 >= 4 and value!= value2:
                    for value3 in values:
                        if value3 >= 2 and value!= value3 and value2!= value3:
                            ans += 1
    
    for value in values:
        if value >= 4:
            for value2 in values:
                if value2 >= 4 and value!= value2:
                    for value3 in values:
                        if value3 >= 2 and value!= value3 and value2!= value3:
                            ans += 1
    
    print(ans)