class main:
    import sys
    
    def main():
        for line in sys.stdin:
            line = line.strip()
            line = line.replace('.', ',')
            line = line.replace(',', ' ')
            tokens = line.split()
            count = 0
            for token in tokens:
                n = len(token)
                if n >= 3 and n <= 6:
                    if count > 0:
                        print(' ', end='')
                    print(token[:n])
                    count += 1
            if count > 0:
                print()
    
    if __name__ == '__main__':
        main()