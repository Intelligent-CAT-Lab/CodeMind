class main:
    import sys
    
    class p03079:
        def solve(self):
            a, b, c = self.read_ints()
            if a == b and b == c:
                print("Yes")
            else:
                print("No")
    
        def read_ints(self):
            return map(int, input().split())
    
    # Sample Test case
    def main():
        mainObj = p03079()
        mainObj.solve()
    
    if __name__ == "__main__":
        main()