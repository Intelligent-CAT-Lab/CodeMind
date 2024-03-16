def main():
    sc_input = input().split()
    sheep = int(sc_input[0])
    wolves = int(sc_input[1])
    
    if wolves >= sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()