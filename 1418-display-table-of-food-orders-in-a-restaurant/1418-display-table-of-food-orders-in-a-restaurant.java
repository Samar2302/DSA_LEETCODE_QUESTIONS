class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> answer = new ArrayList<>();
        TreeMap<Integer, TreeMap<String, Integer>> table = new TreeMap<>();
        Set<String> foodItems = new HashSet<>();
        for(List<String> order: orders) {
            int tableNumber = Integer.parseInt(order.get(1));
            String foodItem = order.get(2);
            foodItems.add(foodItem);
            if(!table.containsKey(tableNumber)) {
                table.put(tableNumber, new TreeMap<String, Integer>());
            }
            TreeMap<String, Integer> entry = table.get(tableNumber);
            entry.put(foodItem, entry.getOrDefault(foodItem, 0) + 1);
        }
        List<String> foodItemsList = new ArrayList<>(foodItems);
        Collections.sort(foodItemsList);
        foodItemsList.add(0, "Table");
        answer.add(foodItemsList);
        for(Map.Entry<Integer, TreeMap<String, Integer>> entry: table.entrySet()) {
            List<String> currentTable = new ArrayList<String>();
            currentTable.add(Integer.toString(entry.getKey()));
            for(int i=1;i<foodItemsList.size();i++) {
                if(entry.getValue().containsKey(foodItemsList.get(i))) {
                    currentTable.add(Integer.toString(entry.getValue().get(foodItemsList.get(i))));
                } else {
                    currentTable.add("0");
                }
            }
            answer.add(currentTable);
        }
        return answer;
    }
}