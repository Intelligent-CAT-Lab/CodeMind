def test(self):

        character1 = RPGCharacter("John", 100, 20, 10)
        character2 = RPGCharacter("Enemy", 100, 15, 5)
        character1.attack(character2)
        character1.attack(character2)
        return character2.hp