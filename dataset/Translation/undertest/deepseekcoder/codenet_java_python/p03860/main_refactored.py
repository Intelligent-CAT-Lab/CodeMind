class main:
    def convert_to_abc(s):
        words = s.split(" ")
        upper = words[1][0]
        return "A" + upper + "C"
    
    print(convert_to_abc("AtCoder Beginner Contest"))