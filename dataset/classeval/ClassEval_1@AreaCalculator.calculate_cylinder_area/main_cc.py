import math
class AreaCalculator: 
    def __init__(self, radius):
        """
        Initialize the radius for shapes.
        :param radius: float
        """
        self.radius = radius

    def calculate_cylinder_area(self, height):
        return 2 * math.pi * self.radius * (self.radius + height)