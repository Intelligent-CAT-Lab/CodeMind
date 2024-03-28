class main:
    def pluralize(s):
        if s.endswith('s'):
            return s + 'es'
        else:
            return s + 's'
    
    s = input()
    print(pluralize(s))