import re

def main():
    str = input("Enter a string: ")
    if re.match("[A-Z]", str):
        print("A")
    else:
        print("a")

if __name__ == "__main__":
    main()