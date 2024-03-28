import sys

input_str = sys.stdin.readline().strip()
output_str = ""

for i in range(3):
    output_str += input_str[i].upper()

print(output_str)



$ python3 program.py
atcoder beginner contest
ABC