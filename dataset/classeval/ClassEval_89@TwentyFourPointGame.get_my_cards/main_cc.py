import random
class TwentyFourPointGame: 
    def __init__(self) -> None:
        self.nums = []


    def get_my_cards(self):
        self.nums = []
        self._generate_cards()
        return self.nums
    def _generate_cards(self):
        for i in range(4):
            self.nums.append(random.randint(1, 9))
        assert len(self.nums) == 4