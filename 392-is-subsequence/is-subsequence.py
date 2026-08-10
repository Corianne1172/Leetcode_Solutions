class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) > len(t):
            return False
        
        s_current = 0
        t_current = 0

        while s_current < len(s) and t_current < len(t):
            if t[t_current] == s[s_current]:
                s_current+=1
                t_current+=1

            else:
                t_current+=1

        return s_current == len(s)