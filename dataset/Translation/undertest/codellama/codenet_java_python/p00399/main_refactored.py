class main:
    import sys
    
    def main():
        num_dog = sys.stdin.readline().split()
        result = 0
        for i in range(len(num_dog)):
            result += int(num_dog[i])
        print(result)
    
    if __name__ == "__main__":
        main()