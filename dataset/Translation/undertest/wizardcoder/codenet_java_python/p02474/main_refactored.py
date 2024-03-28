class main:
    import sys
    
    class p02474:
    
        BIG_NUM = 2000000000
        MOD = 1000000007
    
        def main(self):
            input = sys.stdin.readline().split()
            A = int(input[0])
            B = int(input[1])
    
            ans = A * B
            print(ans)
    
    if __name__ == '__main__':
        p02474().main()