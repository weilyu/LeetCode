class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        stmap = {}
        tsmap = {}
        for i in range(len(s)):
            if s[i] in stmap.keys():
                if t[i] != stmap[s[i]]:
                    return False
            else:
                stmap[s[i]] = t[i]
            if t[i] in tsmap.keys():
                if s[i] != tsmap[t[i]]:
                    return False
            else:
                tsmap[t[i]] = s[i]
        return True
