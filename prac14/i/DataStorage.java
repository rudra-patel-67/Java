import java.util.HashMap;
import java.util.Map;

public class DataStorage {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("Name","Tom");
        data.put("Email","tom@gmail.com");
        data.put("Phone","9988776655");
        System.out.println("Data saved successfully");
        System.out.println(data);
    }
    
}
