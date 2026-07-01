class RandomizedSet {
            
        HashMap<Integer, Integer> hashedSet = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

    public RandomizedSet() {

    }
    
    public boolean insert(int val) {
        if(hashedSet.containsKey(val)){
            return false;
        }
        list.add(val); 
        hashedSet.put(val, list.size() - 1);
        return true;
    }
    
public boolean remove(int val) {
    if(!(hashedSet.containsKey(val))){
        return false;
    }

    int valIndex = hashedSet.get(val);          
    int lastVal = list.get(list.size() - 1);

    if(valIndex != list.size() - 1) {
        list.set(valIndex, lastVal);
        hashedSet.put(lastVal, valIndex);
    }

    hashedSet.remove(val);
    list.remove(list.size() - 1);           
    return true;
}
    
    public int getRandom() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */