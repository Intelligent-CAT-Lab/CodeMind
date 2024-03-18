def solve(a):
    # Create a list with characters 'a', 'b', and 'c' according to the input counts
    char_list = []
    for j in range(3):
        char_list.extend([chr(ord('a') + j)] * a[j])

    # Combine the smallest and largest strings until one string remains
    while len(char_list) > 1:
        char_list.sort()
        s = char_list[0] + char_list[-1]
        char_list[0] = s
        char_list.pop()
    
    return char_list[0]

def main():
    input_data = list(map(int, input().split()))
    output = solve(input_data)
    print(output)

if __name__ == "__main__":
    main()