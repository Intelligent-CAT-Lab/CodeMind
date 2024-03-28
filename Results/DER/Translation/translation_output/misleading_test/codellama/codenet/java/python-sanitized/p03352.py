import math

def find_closest_number(nums, target):
    return min(nums, key=lambda x: abs(x - target))

def main():
    nums = [1, 4, 8, 16, 32, 64, 128, 256, 512, 9, 27, 81, 243, 729, 16, 64, 256, 1024, 25, 125, 625, 36, 216, 49, 343, 64, 512, 81, 729, 100, 1000, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961]
    target = int(input("Enter a number: "))
    closest_number = find_closest_number(nums, target)
    print(closest_number)

if __name__ == "__main__":
    main()