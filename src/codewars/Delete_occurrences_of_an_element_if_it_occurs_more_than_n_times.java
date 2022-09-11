package codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Delete_occurrences_of_an_element_if_it_occurs_more_than_n_times {
    public static int[] deleteNth(int[] elements, int max) {

        if (max < 1) return new int[0];

        final HashMap<Integer,Integer> map = new HashMap<>();
        final List<Integer> list = new ArrayList<>();

        for (final Integer i : elements) {
            final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
            if (v == null || v < max) list.add(i);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
