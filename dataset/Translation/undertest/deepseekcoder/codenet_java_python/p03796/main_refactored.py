class main:
    import sys
    
    def main():
        cnt = int(sys.stdin.readline().strip())
        power = 1
        for i in range(1, cnt + 1):
            power = (power * i) % (pow(10, 9) + 7)
        print(power)
    
    if __name__ == "__main__":
        main()