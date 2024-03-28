class main:
    import sys
    
    def main():
        # Read input
        strNum = input()
        strNumList = strNum.split()
    
        # Sort the list
        strNumList.sort()
    
        # Convert string to integers
        intNumSmall = int(strNumList[0])
        intNumMiddle = int(strNumList[1])
        intNumLarge = int(strNumList[2])
    
        # Print output
        print(intNumSmall, intNumMiddle, intNumLarge)
    
    if __name__ == "__main__":
        main()