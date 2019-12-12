class Solution:
    def powerfulIntegers(self, x: int, y: int, bound: int) -> List[int]:
        output = set()
        for i in range(sys.maxsize):
            if math.pow(x, i) >= bound:
                break
            for j in range(sys.maxsize):
                num = int(math.pow(x, i) + math.pow(y, j))
                if num <= bound:
                    output.add(num)
                else:
                    break
                if y == 1:
                    break
            if x == 1:
                break
        return sorted(list(output))
                    
