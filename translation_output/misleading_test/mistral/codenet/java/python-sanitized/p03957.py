def solve(input: str, output: str):
    c_index = input.find('C')
    f_index = input.rfind('F')
    if c_index < 0 or f_index < 0 or f_index < c_index:
        output += "No\n"
    else:
        output += "Yes\n"

def main():
    with open("input.txt", "r") as input_file, open("output.txt", "w") as output_file:
        for line in input_file:
            solve(line.strip(), output_file)

if __name__ == "__main__":
    main()