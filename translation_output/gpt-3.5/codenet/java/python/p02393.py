```python
import sys

input_line = sys.stdin.readline().strip()
str_num_list = input_line.split()

str_num_list.sort(key=int)

int_num_small = int(str_num_list[0])
int_num_middle = int(str_num_list[1])
int_num_large = int(str_num_list[2])

print(int_num_small, int_num_middle, int_num_large)
```
