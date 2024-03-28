import sys

def calculate_volume(length, width):
    return (length * width) / 3.305785

if __name__ == "__main__":
    input_values = sys.stdin.readline().split()
    length = float(input_values[0])
    width = float(input_values[1])
    print(calculate_volume(length, width))