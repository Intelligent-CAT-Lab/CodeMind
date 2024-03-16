import sys

def main():
    try:
        with open(sys.stdin, 'r') as reader:
            s = reader.readline()
            print(s.replace(",", " "))
    except Exception as e:
        print(e)

if __name__ == '__main__':
    main()