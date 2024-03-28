class main:
    class FastReader:
        def __init__(self):
            self.br = input()
    
        def nextInt(self):
            return int(self.br)
    
    
    def main():
        s = FastReader()
        h = s.nextInt()
        if h == 1:
            print(1)
        else:
            count = 1
            sum = 0
            while h > 1:
                h = h // 2
                sum += 2 ** count
                count += 1
            print(sum + 1)
    
    
    if __name__ == "__main__":
        main()