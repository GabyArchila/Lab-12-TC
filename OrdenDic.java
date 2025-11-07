import java.util.*;

public class OrdenDic {
    public static void main(String[] args) {
        List<Map<String, Object>> tel = Arrays.asList(
            Map.of("make", "Nokia", "model", 216, "color", "Black"),
            Map.of("make", "Mi Max", "model", 2, "color", "Gold"),
            Map.of("make", "Samsung", "model", 7, "color", "Blue")
        );
        
        
        tel.sort((a, b) -> (Integer)a.get("model") - (Integer)b.get("model"));
        
        System.out.println(tel);
    }
}
