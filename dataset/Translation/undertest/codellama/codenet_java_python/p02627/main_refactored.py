class main:
    import re
    
    def get_letter(input_str):
        if re.match("[A-Z]", input_str):
            return "A"
        else:
            return "a"
    
    print(get_letter("B"))