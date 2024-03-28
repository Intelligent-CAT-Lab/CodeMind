class main:
    class p03264:
        def __init__(self):
            pass
        
        def main(self):
            n = int(input())
            
            o = 0
            e = 0
            
            for i in range(1, n+1):
                if i % 2 == 1:
                    o += 1
                else:
                    e += 1
            
            print(o * e)
    
    if __name__ == "__main__":
        solution = p03264()
        solution.main()