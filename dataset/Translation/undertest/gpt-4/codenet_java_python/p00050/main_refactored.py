class main:
    def swap_fruits(s):
        ans = s.replace("apple", "wwwp")
        ans = ans.replace("peach", "wwwa")
        ans = ans.replace("wwwp", "peach")
        ans = ans.replace("wwwa", "apple")
        return ans
    
    if __name__ == "__main__":
        input_str = input()
        output_str = swap_fruits(input_str)
        print(output_str)