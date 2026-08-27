class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        currentAltitude = 0
        largestAltitude = currentAltitude

        for gain in gain:
            currentAltitude += gain
            largestAltitude = max(largestAltitude, currentAltitude)

        return largestAltitude