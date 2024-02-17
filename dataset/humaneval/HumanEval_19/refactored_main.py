numbers = 'five zero four seven nine eight'
value_map = {
    'zero': 0,
    'one': 1,
    'two': 2,
    'three': 3,
    'four': 4,
    'five': 5,
    'six': 6,
    'seven': 7,
    'eight': 8,
    'nine': 9
}
print(' '.join(sorted([x for x in numbers.split(' ') if x], key=lambda x: value_map[x])))