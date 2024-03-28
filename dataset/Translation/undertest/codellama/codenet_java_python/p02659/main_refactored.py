class main:
    import math
    
    def main():
        a, b = map(float, input().split())
        bb = math.ceil(b * 100)
        ans = int(a * bb / 100)
        print(ans)
    
    if __name__ == '__main__':
        main()