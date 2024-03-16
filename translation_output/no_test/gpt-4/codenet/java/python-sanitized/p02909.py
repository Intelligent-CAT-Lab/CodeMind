# No import is needed for input in Python

def main():
    str_input = input()

    if str_input == "Sunny":
        print("Cloudy")
    if str_input == "Cloudy":
        print("Rainy")
    if str_input == "Rainy":
        print("Sunny")

if __name__ == "__main__":
    main()