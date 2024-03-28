import sys

try:
    # Reading input from stdin and splitting it into elements of a list
    # Note that in Python, we don't explicitly state that input is from stdin as it's the default behavior of `input()`.
    str_input = input().split()
    A = int(str_input[0])
    P = int(str_input[1])
    #