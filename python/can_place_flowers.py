class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        flowerbed = [0] + flowerbed
        flowerbed += [0, 1]
        space = 0
        cap = 0
        for plot in flowerbed:
            if plot == 0:
                space += 1
            if plot == 1:
                cap += int((space - 1) / 2)
                space = 0
        return cap >= n
