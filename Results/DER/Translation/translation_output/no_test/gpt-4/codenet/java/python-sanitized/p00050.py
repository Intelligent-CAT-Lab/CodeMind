if __name__ == "__main__":
    str_input = input()
    ans = str_input.replace("apple", "wwwp")
    ans = ans.replace("peach", "wwwa")
    ans = ans.replace("wwwp", "peach")
    ans = ans.replace("wwwa", "apple")
    print(ans)