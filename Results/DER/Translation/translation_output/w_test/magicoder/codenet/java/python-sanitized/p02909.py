import sys

def main():
    str = sys.stdin.readline().strip()

    if str == "Sunny":
        print("Cloudy")
    elif str == "Cloudy":
        print("Rainy")
    elif str == "Rainy":
        print("Sunny")

if __name__ == "__main__":
    main()