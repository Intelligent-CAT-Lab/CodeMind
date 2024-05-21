import sys

def solve(in_file, out_file):
    in_str = in_file.readline()
    if in_str == "ani\n":
        out_file.write("square1001\n")
    else:
        out_file.write("e869120\n")

if __name__ == "__main__":
    solve(sys.stdin, sys.stdout)