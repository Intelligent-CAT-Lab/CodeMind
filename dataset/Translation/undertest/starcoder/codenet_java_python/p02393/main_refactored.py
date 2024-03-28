class main:
    import sys
    
    def main():
        strNum = sys.stdin.readline()
        strNumList = strNum.split(" ")
        strNumList.sort()
        print(strNumList[0] + " " + strNumList[1] + " " + strNumList[2])
    
    if __name__ == "__main__":
        main()