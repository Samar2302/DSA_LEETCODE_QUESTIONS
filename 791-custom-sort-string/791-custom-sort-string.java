class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) 
            map.put(ch,map.getOrDefault(ch,0)+1);
        StringBuilder sb=new StringBuilder();
        for(char ch:order.toCharArray()){
            if(map.containsKey(ch)){
                int i=map.get(ch);
                while(i>0){
                    sb.append(ch);
                    i--;
                }
                map.remove(ch);
            }if(map.size()==0) break;
        }
        if(map.isEmpty()) return sb.toString();
        for(Map.Entry<Character,Integer> x:map.entrySet()){
            int i=x.getValue();
            while(i>0){
                sb.append(x.getKey());
                i--;
            }
        }
        return sb.toString();
    }
}