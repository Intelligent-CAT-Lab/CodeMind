class main:
    def is_uncopyrightable(input_string):
        remove_duplication = set(input_string)
        if len(input_string) == len(remove_duplication):
            return "yes"
        else:
            return "no"
    
    input_string = input()
    print(is_uncopyrightable(input_string))