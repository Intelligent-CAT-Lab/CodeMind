import math
import sys

def run(input_stream):
    d = float(input_stream.readline().strip())
    if d < 1:
        print(d * math.sqrt(2))
    elif d < math.sqrt(2):
        print("2")
    elif d < 2:
        print(d * math.sqrt(2))
    elif d < math.sqrt(2) *