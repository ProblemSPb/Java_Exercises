// most frequent number in an array

import java.util.HashMap;

public class MostFrequentN {

    public static void main(String[] args) {

        int[] array1 = {1, 5, 8, 3, 1, 1, 8};

        System.out.println(mostFrequent(array1));

    }

    public static Integer mostFrequent (int[] givenArray) {
        Integer maxCount = -1;
        Integer maxItem = null;

        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

        for (int i = 0; i < givenArray.length; i++) {

            if (count.containsKey(givenArray[i])) {
               // Integer newVal = count.get(i) + 1;
              //  count.put(i, newVal);
                count.put(givenArray[i],count.get(givenArray[i]) + 1);
            }
            else {
                count.put(givenArray[i], 1);
            }
          //  System.out.println(maxCount);
            if (count.get(givenArray[i]) > maxCount) {
                maxCount = count.get(givenArray[i]);
                maxItem = givenArray[i];
            }

        }

        return maxItem;
    }
}

