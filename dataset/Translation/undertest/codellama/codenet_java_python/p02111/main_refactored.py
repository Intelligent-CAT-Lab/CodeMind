class main:
    import math
    
    def main():
        n = int(input())
        minute = 12 * 60 * n / 360
        print(math.floor(minute / 60), minute % 60)
    
    if __name__ == '__main__':
        main()