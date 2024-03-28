class main:
    def calculate_gcd(A, B, K):
        s = []
        z = 1
        y = 0
        while z <= A and z <= B:
            if A % z == 0 and B % z == 0:
                s.append(z)
                y += 1
            z += 1
        return s[y-K]
    
    A, B, K = map(int, input().split())
    result = calculate_gcd(A, B, K)
    print(result)