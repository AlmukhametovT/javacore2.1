import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("Sorted by collection methods:");
        List<Integer> filterList = new ArrayList<>();
        Iterator i = intList.iterator();
        while (i.hasNext()) {
            int check = (int) i.next();
            if (check > 0 && check % 2 == 0) {
                filterList.add(check);
            }
        }
        filterList.sort(Comparator.naturalOrder());
        System.out.println(filterList);
    }
}