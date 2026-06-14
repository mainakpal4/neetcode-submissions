class TimeMap {

    private HashMap<String,HashMap<Integer,List<String>>> hm;


    public TimeMap() {
        hm=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
            hm.put(key,new HashMap<>());
        }
        if(!hm.get(key).containsKey(timestamp)){
            hm.get(key).put(timestamp,new ArrayList<>());
        }

        hm.get(key).get(timestamp).add(value);
    }
    
    public String get(String key, int timestamp) {
         
         if (!hm.containsKey(key)) {
            return "";
        }

         int seen = 0;
        for (int time : hm.get(key).keySet()) {
            if (time <= timestamp) {
                seen = Math.max(seen, time);
            }
        }

        
        if (seen == 0) return "";
        int back = hm.get(key).get(seen).size() - 1;
        return hm.get(key).get(seen).get(back);
        

    }
}
