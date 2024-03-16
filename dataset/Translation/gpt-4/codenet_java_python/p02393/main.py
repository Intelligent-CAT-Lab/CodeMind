def main():
    str_num_list = input().split(" ")
    int_num_list = [int(num) for num in str_num_list]
    int_num_list.sort()

    int_num_small, int_num_middle, int_num_large = int_num_list

    print(f"{int_num_small} {int_num_middle} {int_num_large}")

if __name__ == "__main__":
    main()