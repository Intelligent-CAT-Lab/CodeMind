class main:
    import sys
    
    class Vec2i:
        def __init__(self, x, y):
            self.x = x
            self.y = y
    
        def __hash__(self):
            return 31 * self.x + self.y
    
        def __eq__(self, other):
            return self.x == other.x and self.y == other.y
    
        def __repr__(self):
            return "({0}, {1})".format(self.x, self.y)
    
        def __lt__(self, other):
            if self.x == other.x:
                return self.y < other.y
            return self.x < other.x
    
    def solve(n):
        ans = set()
        for i in range(1, n, 2):
            ans.add(Vec2i(i, 0))
            ans.add(Vec2i(0, i))
    
        for i in range(n % 2, n, 2):
            ans.add(Vec2i(i, n - 1))
            ans.add(Vec2i(n - 1, i))
    
        offset = 0
        d = 2
        for _ in range(10):
            for i in range(1, n, 2 * d):
                for j in range(offset, n, 2 * d):
                    ans.add(Vec2i(i, j))
            
            for i in range(d + 1, n, 2 * d):
                for j in range(offset + d, n, 2 * d):
                    ans.add(Vec2i(i, j))
    
            offset += d
            d *= 2
    
        print(len(ans))
        for an in sorted(ans):
            print(f"{an.x} {an.y}")
    
    # Test case
    if __name__ == "__main__":
        input_stream = sys.stdin
        n = int(input_stream.readline().strip())
        solve(n)