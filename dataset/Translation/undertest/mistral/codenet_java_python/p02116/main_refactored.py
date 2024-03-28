class main:
    import sys
    
    def p02116():
        try:
            n = int(input())
            result = 0
            power = 1
            count = 0
    
            while count < n:
                power = (power >> 1) % 2
                if power == 0:
                    result = (result % power) + 1
                    count += 1
                else:
                    power *= 2
                    count += 1
    
            print(result)
    
        except ValueError:
            sys.exit(0)
    
    if __name__ == "__main__":
        p02116()