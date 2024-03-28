import sys

def main():
    line = sys.stdin.readline()
    tmpArray = line.split()
    overLimit = int(tmpArray[0])
    prevDay = int(tmpArray[1])
    overDay = int(tmpArray[2])
    if prevDay >= overDay:
        print("delicious")
    elif prevDay + overLimit < overDay:
        print("dangerous")
    else:
        print("safe")

if __name__ == "__main__":
    main()