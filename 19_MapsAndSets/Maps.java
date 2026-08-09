import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aashish", 21); map.put("Anurag", 23); map.put("Aditya", 29);
        map.put("Vivek", 33); map.put("Deepika", 21); map.put("Vikash", 28);
        map.put("Aashish", 21);
        map.put("Aashish", 24);
        for(String key : map.keySet()){
            System.out.print(key+"="+map.get(key)+" ");
        }
        System.out.println();
        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("Abh"));
    }
}