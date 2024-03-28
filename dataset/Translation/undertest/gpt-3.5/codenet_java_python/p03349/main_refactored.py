class main:
    import sys
    from collections import defaultdict
    
    class ESequenceGrowingHard:
        def __init__(self):
            self.MOD = 10**9 + 7
            self.k = 0
            self.n = 0
            self.numberOfSequencesOfSizeIwithElementBigger