import sys

# To read the input from stdin buffered, we wrap sys.stdin with io.BufferedReader.
from io import BufferedReader
import sys

# We need to import the BigInteger functionality from the 'decimal' module in Python.
from decimal import Decimal

# Wrap the stdin with BufferedReader to make it more efficient.
input_stream = BufferedReader(sys.stdin)

for line in input_stream:
    # Split the line into two parts, separating by whitespace, then map the Decimal constructor to each part.
    a, b = map(Decimal, line.split())
    # Print the remainder of a divided by b. We use the % operator for remainder/modulo in Python.
    print(a % b)

# Close the input stream
input_stream.close()