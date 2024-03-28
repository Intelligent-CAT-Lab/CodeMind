class main:
    import sys
    
    class codeforces_569_A:
        @staticmethod
        def main():
            inp = sys.stdin.readline().split()
            t = int(inp[0])
            s = int(inp[1])
            q = int(inp[2])
            sum = 0
            while s < t:
                s = s * q
                sum += 1
            print(sum)
    
    if __name__ == "__main__":
        codeforces_569_A.main()