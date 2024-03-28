class main:
    import math
    
    def main():
        h = int(input())
        if h == 1:
            print(1)
        else:
            count = 1
            sum = 0
            while h > 1:
                h = h / 2
                sum += math.pow(2, count)
                count += 1
            print(int(sum + 1))
    
    
    if __name__ == '__main__':
        main()