class main:
    def sort_numbers():
        numbers = input().split()
        numbers = [int(i) for i in numbers]
        numbers.sort()
        print(numbers[0], numbers[1], numbers[2])
    
    sort_numbers()