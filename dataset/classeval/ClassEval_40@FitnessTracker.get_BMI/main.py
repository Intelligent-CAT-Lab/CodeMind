import unittest
class FitnessTracker:
    def __init__(self, height, weight, age, sex) -> None:
        self.height = height
        self.weight = weight
        self.age = age
        self.sex = sex
        self.BMI_std = [
            {"male": [20, 25]},
            {"female": [19, 24]}
        ]

    def get_BMI(self):
        return self.weight / self.height ** 2

    def condition_judge(self):
        BMI = self.get_BMI()
        if self.sex == "male":
            BMI_range = self.BMI_std[0]["male"]
        else:
            BMI_range = self.BMI_std[1]["female"]
        if BMI > BMI_range[1]:
            # too fat
            return 1
        elif BMI < BMI_range[0]:
            # too thin
            return -1
        else:
            # normal
            return 0

    def calculate_calorie_intake(self):
        if self.sex == "male":
            BMR = 10 * self.weight + 6.25 * self.height - 5 * self.age + 5
        else:
            BMR = 10 * self.weight + 6.25 * self.height - 5 * self.age - 161
        if self.condition_judge() == 1:
            calorie_intake = BMR * 1.2  # Sedentary lifestyle
        elif self.condition_judge() == -1:
            calorie_intake = BMR * 1.6  # Active lifestyle
        else:
            calorie_intake = BMR * 1.4  # Moderate lifestyle
        return calorie_intake
class Test(unittest.TestCase):
    def test(self):
            fitnessTracker = FitnessTracker(1.72, 65, 20, "male")
            return fitnessTracker.get_BMI()