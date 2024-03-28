def main():
    time = input().split('/')[2]
    if time[0] == '1' or int(time[1]) > 4:
        print("TBD")
    else:
        print("Heisei")

if __name__ == "__main__":
    main()