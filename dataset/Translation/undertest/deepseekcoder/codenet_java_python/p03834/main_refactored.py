class main:
    import sys
    
    def replace_commas_with_spaces():
        s = sys.stdin.readline().strip()
        print(s.replace(",", " "))
    
    if __name__ == "__main__":
        replace_commas_with_spaces()