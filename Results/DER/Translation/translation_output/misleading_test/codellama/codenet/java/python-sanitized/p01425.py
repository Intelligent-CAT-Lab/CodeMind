import math

# Define the constants
N = 0
V = 7
X = 3
Y = 1
EPS = 1e-6

# Define the arrays
L = []
B = []
R = []
T = []

# Define the function to calculate the velocity
def calc(vy, t):
    return vy*t - g*t*t/2

# Define the function to check if the bird can fly
def check(qx, qy):
    # Calculate the acceleration
    a = g*g/4
    # Calculate the velocity
    b = g*qy - V*V
    # Calculate the distance
    c = qx*qx + qy*qy