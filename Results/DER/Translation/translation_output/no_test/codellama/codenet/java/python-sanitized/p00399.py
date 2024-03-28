import sys

def main():
    result = 0
    num_dogs = sys.stdin.readline().split()
    for dog in num_dogs:
        result += int(dog)
    print(result)

if __name__ == "__main__":
    main()