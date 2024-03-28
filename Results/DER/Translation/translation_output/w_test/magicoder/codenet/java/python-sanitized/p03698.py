def check_uniqueness(input_string):
    remove_duplication = set(input_string)
    if len(input_string) == len(remove_duplication):
        return "yes"
    else:
        return "no"

try:
    input_string = input()
    print(check_uniqueness(input_string))
except Exception as e:
    print(e)