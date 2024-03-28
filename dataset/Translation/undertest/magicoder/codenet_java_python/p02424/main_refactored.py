class main:
    def to_binary(n):
        return format(n, '032b')
    
    a, b = map(int, input().split())
    
    print(to_binary(a & b))
    print(to_binary(a | b))
    print(to_binary(a ^ b))