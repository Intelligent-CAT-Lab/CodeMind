# Equivalent Python code

def count_marbles(number_str):
    marbles = 0
    for char in number_str:
        if char == '1':
            marbles += 1
    return marbles

if __name__ == "__main__":
    a = input()
    marbles_count = count_marbles(a)
    print(marbles_count)