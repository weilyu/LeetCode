class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        bill_left = {5:0, 10:0}
        for bill in bills:
            if bill == 10:
                if bill_left[5] < 1:
                    return False
                bill_left[5] -= 1
                bill_left[10] += 1
            if bill == 20:
                if bill_left[10] >= 1 and bill_left[5] >= 1:
                    bill_left[10] -= 1
                    bill_left[5] -= 1
                elif bill_left[5] >= 3:
                    bill_left[5] -= 3
                else:
                    return False
            if bill == 5:
                bill_left[5] += 1
        return True
        
