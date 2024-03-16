def main():
    n = int(input())
    
    for i in range(1, 3510):
        for j in range(1, 3510):
            si = n * i * j
            bo = 4 * i * j - n * j - n * i
            if bo <= 0:
                continue
            if si % bo == 0:
                print(i, j, si // bo)
                return

if __name__ == "__main__":
    main()