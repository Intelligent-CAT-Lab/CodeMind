def main():
    str_input = input()
    ans = str_input.replace("apple", "wwwp").replace("peach", "wwwa").replace("wwwp", "peach").replace("wwwa", "apple")
    print(ans)

if __name__ == "__main__":
    main()