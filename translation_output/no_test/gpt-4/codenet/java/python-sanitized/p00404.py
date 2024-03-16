class p00404:
    
    def search(self, x, y):
        x_min = 0
        y_min = 0
        x_max = 0
        y_max = 0
        f1 = 1
        f2 = 0
        
        for p in range(1<<30):  # Just a very large number to ensure the loop goes on for a while
            if x_min <= x <= x_max and y_min <= y <= y_max:
                return p % 3 + 1
            
            f = f1 + f2
            if p % 4 == 0:
                x_max += f  # east
            elif p % 4 == 1:
                y_max += f  # north
            elif p % 4 == 2:
                x_min -= f  # west
            else:
                y_min -= f  # south
            
            f2 = f1
            f1 = f

    def solve(self):
        x = int(input())
        y = int(input())
        print(self.search(x, y))

if __name__ == "__main__":
    p00404().solve()