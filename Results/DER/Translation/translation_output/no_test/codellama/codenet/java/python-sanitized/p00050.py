import sys

def main():
    try:
        str = sys.stdin.readline()
        ans = str.replace("apple", "wwwp")
        ans = ans.replace("peach", "wwwa")
        ans = ans.replace("wwwp", "peach")
        ans = ans.replace("wwwa", "apple")
        print(ans)
    except:
        print("Error:", sys.exc_info()[0])

if __name__ == "__main__":
    main()