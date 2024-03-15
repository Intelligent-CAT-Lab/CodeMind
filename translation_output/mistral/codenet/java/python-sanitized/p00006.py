import sys

def main():
    # Read input from user
    str = input()
    
    # Initialize empty string to store reversed string
    ret = ""
    
    # Loop through each character in the string
    for i in range(len(str)):
        # Append current character to the end of reversed string
        ret += str[i]
    
    # Print reversed string
    print(ret)

if __name__ == "__main__":
    main()