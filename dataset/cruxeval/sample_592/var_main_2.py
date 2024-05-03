def f(numbers):
    new_numbers = []	## new_numbers = []
    for i, _ in enumerate(numbers):	## i = [] | _ = [] | numbers = []
        new_numbers.append(numbers[len(numbers)-1-i])	## new_numbers = [] | numbers = [] | i = []
    return new_numbers	## new_numbers = []
