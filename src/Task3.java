import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 5, 9, 15, 9, 7, 7, 12};
        int[] arr2 = {1, 2, 2, 3, 4, 15, 9, 7, 12, 14};
        printIntersect(arr1, arr2);
    }

    private static void printIntersect(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        //put first array to map
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], 1);
            } else {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }
        }

        //check all value in array two
        for (int i = 0; i < arr2.length; i++) {
            //if exist and value>1  then decrement value
            //if value is 1 remove from map
            if (map.containsKey(arr2[i])) {
                System.out.print(arr2[i] + " ");
                if (map.get(arr2[i]) > 1) {
                    map.put(arr2[i], map.get(arr2[i]) - 1);
                } else {
                    map.remove(arr2[i]);
                }
            }
        }
    }
}
