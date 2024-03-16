def atcoder_ABC164_A():
    # Reading a line of input from the user and splitting it into a list
    numlist = input().split(" ")
    
    # Parsing the strings into integers
    Sheep = int(numlist[0])
    Wolve = int(numlist[1])
    
    # Checking if the number of wolves is greater than or equal to the number of sheep
    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

# Calling the function if running this script
if __name__ == "__main__":
    atcoder_ABC164_A()