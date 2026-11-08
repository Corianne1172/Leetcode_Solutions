class Solution:
    def predictPartyVictory(self, senate: str) -> str:
        senate_size = len(senate)
        radiant_queue = deque()
        dire_queue = deque()

        for i in range(senate_size):
            if senate[i] == 'R':
                radiant_queue.append(i)
            else:
                dire_queue.append(i)
        
        while radiant_queue and dire_queue:
            if radiant_queue[0] < dire_queue[0]:
                radiant_queue.append(radiant_queue[0] + senate_size)
                radiant_queue.popleft()
                dire_queue.popleft()

            else:
                dire_queue.append(dire_queue[0] + senate_size)
                radiant_queue.popleft()
                dire_queue.popleft()
        
        if radiant_queue:
            return "Radiant"
        return "Dire"