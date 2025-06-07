import java.util.HashMap;
import java.util.Map;

public class Main {

public static boolean hasDuplicate(int[] nums){
    boolean state = false;
    Map<Integer, Integer> map = new HashMap<>();
    for(int i : nums){
        Integer j = map.get(i);
        map.put(i, (j == null) ? 1 : j+1);
    }

    for(Map.Entry<Integer,Integer> s : map.entrySet()){
        if(s.getValue() > 1){
            state = true;
        }
    }
    return state;
}


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4 , 5, 5, 5};   
        System.out.println(hasDuplicate(nums));

        }
}
