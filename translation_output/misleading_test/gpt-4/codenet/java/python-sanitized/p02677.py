import math

def calculate_hand_distance(A, B, H, M):
    a_x = A * math.sin(math.pi * 2 * (H * 60 + M) / 720)
    b_x = B * math.sin(math.pi * 2 * M / 60)
    a_y = A * math.cos(math.pi * 2 * (H * 60 + M) / 720)
    b_y = B * math.cos(math.pi * 2 * M / 60)
    return math.sqrt((a_x - b_x) ** 2 + (a_y - b_y) ** 2)

# Sample test case
if __name__ == "__main__":
    A, B, H, M = map(int, input().split())
    print(calculate_hand_distance(A, B, H, M))