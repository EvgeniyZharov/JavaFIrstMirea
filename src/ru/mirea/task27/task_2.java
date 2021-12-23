package ru.mirea.task27;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task_2 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> city_russia = new ArrayList<>();
        city_russia.add("Sochi");
        city_russia.add("Moscow");
        city_russia.add("Saint Petersburg");
        map.put("Russia", city_russia);

        ArrayList<String> citi_usa = new ArrayList<>();
        citi_usa.add("New York");
        citi_usa.add("Washington");
        citi_usa.add("Nevada");
        map.put("USA", citi_usa);

        System.out.println(map);
        System.out.println(map.get("Russia"));
        System.out.println(map.get("USA"));

    }
}
