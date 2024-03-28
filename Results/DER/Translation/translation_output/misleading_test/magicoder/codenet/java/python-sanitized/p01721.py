import sys
import math

def get_pow_distance(w, h, mx, my, p, q, x, y):
    wp = 0
    wq = 0

    if mx % 2 == 0:
        wp = mx * w +