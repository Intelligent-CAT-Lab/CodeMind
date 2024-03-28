def solve(input: str, output: str):
    c_index = input.find('C')
    f_index = input.rfind('F')
    if c_index < 0 or f_index < 0 or f_index < c_index:
        output.write("No\n")
    else:
        output.write("Yes\n")

if __name__ == "__main__":
    input = input()
    output = output()
    solve(input, output)