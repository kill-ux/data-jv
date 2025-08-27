import java.util.*;

public class TopFrequents {
    public List<Integer> findTopKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList();
        Map<Integer,Integer> map = new HashMap();
        for (Integer num : nums) {
            if (!list.contains(num)) {
                map.put(num , 1);
                list.add(num);
            } else {
                map.put(num , map.get(num) + 1);
            }
        }
        Collections.sort(list, (a ,b) -> map.get(b).compareTo(map.get(a)));
        return list.subList(0,Math.min(k,list.size()));
    }
}