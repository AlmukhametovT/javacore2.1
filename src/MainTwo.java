import java.util.*;

public class MainTwo {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        System.out.println("Sorted by collection methods v.2:");
        boolean[] indexForRemove = new boolean[intList.size()];
        Iterator<Integer> i = intList.iterator();
        while (i.hasNext()) {
            int check = i.next();
            if (check > 0 && check % 2 == 0) {
                indexForRemove[intList.indexOf(check)] = true;
            }
        }
        for (int j = indexForRemove.length - 1; j > -1; j--) {
            if (!indexForRemove[j]) {
                intList.remove(j);
            }
        }
        intList.sort(Comparator.naturalOrder());
        System.out.println(intList);
    }
}