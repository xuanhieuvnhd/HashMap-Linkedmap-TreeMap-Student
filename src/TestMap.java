import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 30);
        hashMap.put("D", 31);
        hashMap.put("C", 29);
        hashMap.put("B", 40);
        System.out.println("Danh sach: ");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Danh sach theo thu tu tang dan theo key(AlphaB)");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("B", 30);
        linkedHashMap.put("D", 31);
        linkedHashMap.put("A", 29);
        linkedHashMap.put("C", 29);
        System.out.println("\nTuoi cua " + "Hoang la:  " + linkedHashMap.get("B"));
    }
}
