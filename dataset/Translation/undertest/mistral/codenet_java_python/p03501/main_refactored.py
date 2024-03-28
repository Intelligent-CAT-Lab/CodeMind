class main:
    import sys
    
    def dist(p1, p2):
        return (abs(p2[0]-p1[0])+abs(p2[1]-p1[1]))
    
    def gcd(a, b):
        if a < b:
            return gcd(b,a)
        if b == 0:
            return a
        else:
            return gcd(b,a%b)
    
    def power(x, y, m):
        if y < 0:
            return 0
        ans = 1
        x %= m
        while y > 0:
            if(y % 2 == 1):
                ans = (ans * x) % m
            y /= 2
            x = (x * x) % m
        return ans
    
    def shuffle(array):
        random = sys.random.SystemRandom()
        for i in range(len(array)):
            random_position = random.randint(0, len(array)-1)
            array[i], array[random_position] = array[random_position], array[i]
    
    def sort(array):
        return sorted(array, key=lambda x: (x[0], x[1]))
    
    if __name__ == "__main__":
        N = int(input())
        A = int(input())
        B = int(input())
        print(min(A*N, B))