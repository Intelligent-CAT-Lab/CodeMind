class main:
    def next_int(scanner):
        return int(scanner.next())
    
    def main():
        scanner = input().split()
        h1 = next_int(scanner[0])
        m1 = next_int(scanner[1])
        h2 = next_int(scanner[2])
        m2 = next_int(scanner[3])
        k = next_int(scanner[4])
        h = h2 - h1
        m = m2 - m1
        day = (h * 60) + m
        print(day - k)
    
    main()