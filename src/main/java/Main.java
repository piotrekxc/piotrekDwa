import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello world");

        Map<String,Integer>Distances = new LinkedHashMap<String, Integer>();

        Distances.put("Kielce", 360);
        Distances.put("Wrocław", 0);

        System.out.println(Distances.size());
    }
}
