class main:
    import heapq
    
    class P:
        def __init__(self, x, d):
            self.x = x
            self.d = d
            
        def __lt__(self, other):
            # Compare based on 'd' in descending order
            return self.d < other.d
    
    def main():
        n = int(input())  # Read the input
        lis = []
        a, b = 9, 10
        
        for i in range(1, 10):
            lis.append(P(i, -11+i))
        lis.append(P(19, -1))
        
        # Instead of directly sorting, we use a heap to automatically order the elements
        heapq.heapify(lis)
        
        for i in range(1, 15):
            for w in range(1, 1000):
                x = w * b + a
                y = x
                e = 0
                while x > 0:
                    e += x % 10
                    x //= 10
                heapq.heappush(lis, P(y, y/e))
            b *= 10
            a *= 10
            a += 9
        
        max_x = 0
        while n > 0:
            p = heapq.heappop(lis)
            if max_x < p.x:
                max_x = p.x
                print(max_x)
                n -= 1
    
    if __name__ == '__main__':
        main()