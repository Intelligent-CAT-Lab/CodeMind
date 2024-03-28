class main:
    import math
    
    def get_binary_representation(n):
        result = []
        for i in range(n):
            temp = i
            for j in range(math.floor(math.log2(i)) + 1):
                if temp % 2 == 1:
                    result.append(j)
                temp //= 2
        return result
    
    n = int(input("Enter a number: "))
    result = get_binary_representation(n)
    print(result)