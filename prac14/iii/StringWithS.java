import java.util.TreeSet;

public class StringWithS {
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("Smith");
        name.add("Alex");
        name.add("Tom");
        name.add("Steve");
        name.add("Mark");
        name.add("Sammy");
        int count=0;
        for(String str : name){
            if (str.startsWith("S")) {
                count++;
            }
        }
        System.out.println("Set of Names : "+name);
        System.out.println("Count of string starting with S : "+count);
    }
}
