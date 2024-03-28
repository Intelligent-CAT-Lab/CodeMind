import math

class ESequenceGrowingHard:
    def __init__(self, n, k, MOD):
        self.n = n
        self.k = k
        self.MOD = MOD
        self.nChK = self.preComputeNChooseK_MOD_Mod(n, MOD)
        self.numberOfSequencesOfSizeIwithElementBigger