import math
class AreaCalculator: 
    def __init__(self, radius):
        """
        Initialize the radius for shapes.
        :param radius: float
        """
        self.radius = radius

    def calculate_sphere_area(self):
        return 4 * math.pi * self.radius ** 2