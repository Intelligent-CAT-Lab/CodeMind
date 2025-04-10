import unittest
class RPGCharacter:
    def __init__(self, name, hp, attack_power, defense, level=1):
        self.name = name
        self.hp = hp
        self.attack_power = attack_power
        self.defense = defense
        self.level = level
        self.exp = 0

    def attack(self, other_character):
        damage = max(self.attack_power - other_character.defense, 1)
        other_character.hp -= damage

    def heal(self):
        self.hp += 10
        if self.hp > 100:
            self.hp = 100
        return self.hp

    def gain_exp(self, amount):
        while amount != 0:
            if self.exp + amount >= self.level * 100:
                amount -= (self.level * 100 - self.exp)
                self.level_up()
            else:
                self.exp += amount
                amount = 0

    def level_up(self):
        if self.level < 100:
            self.level += 1
            self.exp = 0
            self.hp += 20
            self.attack_power += 5
            self.defense += 5
        return self.level, self.hp, self.attack_power, self.defense

    def is_alive(self):
        return self.hp > 0
class Test(unittest.TestCase):
    def test(self):
            character = RPGCharacter("John", 0, 20, 10)
            return character.is_alive()