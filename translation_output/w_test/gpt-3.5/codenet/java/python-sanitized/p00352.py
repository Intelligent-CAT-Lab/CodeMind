import sys

def main():
    input_values = sys.stdin.readline().strip().split()
    a = int(input_values[0])
    b = int(input_values[1])
    
    avg = (a + b) // 2
    print(avg)

if __name__ == "__main__":
    main()