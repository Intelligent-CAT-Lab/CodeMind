
class FitnessTracker: 
    def __init__(self, height, weight, age, sex) -> None:
        """
        Initialize the class with height, weight, age, and sex, and calculate the BMI standard based on sex, and male is 20-25, female is 19-24.
        """
        self.height = height
        self.weight = weight
        self.age = age
        self.sex = sex
        self.BMI_std = [
            {"male": [20, 25]},
            {"female": [19, 24]}
        ]

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
    def get_BMI(self):
        return self.weight / self.height ** 2