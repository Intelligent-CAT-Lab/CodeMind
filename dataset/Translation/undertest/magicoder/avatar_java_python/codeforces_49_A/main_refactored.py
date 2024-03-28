class main:
    def check_last_char(question):
        vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
        ch = question[-1]
        if ch in vowels or ch.lower() in vowels:
            return "YES"
        else:
            return "NO"
    
    question = input().strip()
    print(check_last_char(question))