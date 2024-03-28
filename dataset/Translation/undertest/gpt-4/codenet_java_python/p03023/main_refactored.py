class main:
    def calculate_interior_angle_sum(num_sides):
        return 180 * (num_sides - 2)
    
    num = int(input())
    answer = calculate_interior_angle_sum(num)
    print(answer)