class main:
    import math
    
    def main():
        a, b, c, k = map(int, input().split())
        ans = a - b
        if abs(ans) > math.pow(10, 18):
            print("Unfair")
            return
        if k % 2 == 0:
            print(ans)
        else:
            print(-ans)
    
    if __name__ == '__main__':
        main()