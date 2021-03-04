package com.company;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class taskNumber3 {

    public static DecimalFormat df = new DecimalFormat("0.00");

    public static int Under1eur(Map<String, Double> map) {
        int count = 0;

        for (double price : map.values()) {
            if (price < 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Wine", 7.89);
        map.put("Watermelon", 7.42);
        map.put("Carrot", 1.02);
        map.put("Cheese", 2.86);
        map.put("Salt", 0.76);
        map.put("Bread", 0.85);
        map.put("Chocolate", 2.56);
        map.put("Coffee", 6.90);
        System.out.format("Products that are under 1 eur: " + Under1eur(map));

        Map.Entry<String, Double> min = null;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (min == null || min.getValue() > entry.getValue()) {
                min = entry;
            }
        }
        System.out.println("Product with minimal value: " + min.getKey());

        Map.Entry<String, Double> max = null;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (max == null || entry.getValue().compareTo(max.getValue()) > 0) {
                max = entry;
            }
        }
        System.out.println("Product with maximal value: " + max.getKey());

        HashMap<String, Double> map2 = new HashMap<>();
        map2.put("Strawberries", 8.89);
        map2.put("Melon", 6.54);
        map2.put("Potatoes", 1.02);
        map2.put("Lemons", 2.44);
        map2.put("Cucumbers", 0.95);
        map2.put("Yogurt", 1.05);
        map2.put("Milk", 2.56);
        map2.put("Meat", 6.90);

        map.putAll(map2);

        System.out.println("After merging 2 Hashmaps, there are " + map.size() + " products");
    }
}


