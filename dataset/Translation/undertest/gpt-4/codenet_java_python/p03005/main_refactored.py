class main:
    def main():
        n, k = map(int, input().split())
        
        if k == 1:
            ans = 0
        else:
            ans = n - k
        
        print(ans)
    
    if __name__ == '__main__':
        main()