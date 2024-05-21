import re

def main():
    while True:
        try:
            line = input()
        except:
            break
        line = line.replace('.', ',')
        line = line.replace(',','')
        words = re.findall(r'\w+', line)
        count = 0
        for word in words:
            if 3 <= len(word) <= 6:
                if count > 0:
                    print(' ', end='')
                print(word[:len(word)], end='')
                count += 1
        if count > 0:
            print()

if __name__ == '__main__':
    main()