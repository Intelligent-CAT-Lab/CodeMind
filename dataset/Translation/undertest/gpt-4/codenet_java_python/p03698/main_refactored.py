class main:
    def main():
        try:
            input_string = input()
            unique_characters = set(input_string)
    
            ans = "yes" if len(input_string) == len(unique_characters) else "no"
            print(ans)
        except Exception as e:
            raise e
    
    if __name__ == '__main__':
        main()