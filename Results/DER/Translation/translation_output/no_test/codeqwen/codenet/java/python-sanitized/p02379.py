import math

def main():
    lines = input().split()
    list_ = [float(line) for line in lines]
    print(math.sqrt((list_[0]-list_[2])*(list_[0]-list_[2])+(list_[1]-list_[3])*(list_[1]-list_[3])))

if __name__ == "__main__":
    main()