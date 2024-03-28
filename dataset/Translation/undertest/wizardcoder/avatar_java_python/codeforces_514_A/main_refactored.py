class main:
    import math
    
    def reverse_number(x):
        list = []
        while x > 0:
            r = x % 10
            if 9 - r < r:
                if x // 10 == 0 and 9 - r == 0:
                    list.append(r)
                else:
                    list.append(9 - r)
            else:
                list.append(r)
            x = x // 10
        return list
    
    def reverse_and_add(list):
        new_number = 0
        pow = 0
        for i in list:
            new_number += i * math.pow(10, pow)
            pow += 1
        return new_number
    
    x = int(input())
    list = reverse_number(x)
    new_number = reverse_and_add(list)
    print(new_number)