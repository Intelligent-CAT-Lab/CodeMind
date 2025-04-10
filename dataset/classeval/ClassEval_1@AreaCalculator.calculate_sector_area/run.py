import os
import unittest
import math


class AreaCalculator:

    def __init__(self, radius):
        self.radius = radius

    def calculate_circle_area(self):
        return math.pi * self.radius ** 2

    def calculate_sphere_area(self):
        return 4 * math.pi * self.radius ** 2

    def calculate_cylinder_area(self, height):
        return 2 * math.pi * self.radius * (self.radius + height)

    def calculate_sector_area(self, angle):
        return self.radius ** 2 * angle / 2

    def calculate_annulus_area(self, inner_radius, outer_radius):
        return math.pi * (outer_radius ** 2 - inner_radius ** 2)
class Test(unittest.TestCase):
    def test(self):
            areaCalculator = AreaCalculator(1.5)
            return areaCalculator.calculate_sector_area(math.pi)
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_1@AreaCalculator.calculate_sector_area/output.txt', 'w') as wr:
    wr.write(str(a))
        