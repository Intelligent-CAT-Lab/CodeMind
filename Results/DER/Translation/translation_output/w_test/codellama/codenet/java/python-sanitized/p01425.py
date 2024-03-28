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

# Define the function to calculate the position of the bird
def calc(vy, t):
    return vy*t - g*t*t/2

# Define the function to check if the bird can reach the target
def check(qx, qy):
    # Calculate the initial velocity
    vx = qx / t
    vy = math.sqrt(V*V - vx*vx)

    # Calculate the position of the bird at time t
    y