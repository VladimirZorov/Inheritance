package RandomArrayList;

import java.util.ArrayList;
import java.util.List;

public class RandomArrayList extends ArrayList{

    List<String> arr = new ArrayList<>();

    public Object getRandomElement() {
      int index;
        index = (int) Math.random();
        Object ob=  arr.get(index);
       arr.remove(ob);
        return ob;
    }
 }
