import java.util.Vector;
import java.util.Collections;

public class MinInVec {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.add(8);
        vec.add(9);
        vec.add(1);
        vec.add(3);
        vec.add(4);
        int min = Collections.min(vec);
        System.out.println(vec);
        System.out.println("Minimum in this vector is : "+min);
    }           
}
