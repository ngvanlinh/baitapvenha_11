package Bai2;

import java.util.HashMap;
import java.util.Map;

public class timChuoi {
    private Map<String, Integer> mapChuoi = new HashMap<>();

    public Map<String, Integer> countString(String input, int length) {

        int n = input.length();
        for (int i = 0; i <= n-length; i++) {
            String chuoi = input.substring(i, i + length);
            mapChuoi.put(chuoi, mapChuoi.getOrDefault(chuoi,0)+1);
        }
        return mapChuoi;
    }

    public void findSubstrings(String input, int length) {
        Map<String, Integer> map = countString(input, length);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
