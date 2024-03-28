import sys

def main():
    input_data = sys.stdin.readline().split()
    k = int(input_data[0]) - 1
    b = int(input_data[1]) - 1
    print(k * b)
    
if __name__ == '__main__':
    main()