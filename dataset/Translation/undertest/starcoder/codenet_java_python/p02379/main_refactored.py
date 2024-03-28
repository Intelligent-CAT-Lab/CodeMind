class main:
    import math
    
    def main():
        x1, y1, x2, y2 = map(float, input().split())
        print(math.sqrt((x1-x2)**2 + (y1-y2)**2))
    
    if __name__ == '__main__':
        main()