def main():
    x = int(input())
    next_value = 2
    for i in range(x):
        next_value = (next_value + 1) * 2
    print(next_value)

if __name__ == "__main__":
    main()