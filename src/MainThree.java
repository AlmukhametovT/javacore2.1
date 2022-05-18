import java.util.*;

public class MainThree {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        System.out.println("Sorted by collection methods v.3:");
        Iterator<Integer> i = intList.iterator();
        while (i.hasNext()) {
            int check = i.next();
            if (check <= 0 || check % 2 != 0) {
                i.remove();
            }
        }
        intList.sort(Comparator.naturalOrder());
        System.out.println(intList);
    }
}