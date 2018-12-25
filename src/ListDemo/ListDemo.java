package ListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        // ArrayList
        List<Integer> userAgeList = new ArrayList<>();

        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);
        userAgeList.add(2, 51);

        System.out.println(userAgeList.size());

        userAgeList.remove(3);

        System.out.println(userAgeList.contains(12));

        System.out.println(userAgeList.indexOf(12));

        System.out.println(userAgeList.get(2));

        Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);

        System.out.println(userAgeArray[0]);
        System.out.println(userAgeList);


        // LinkedList
        List<Integer> userAgeList2 = new LinkedList<>();

        userAgeList2.add(40);
        userAgeList2.add(53);
        userAgeList2.add(45);
        userAgeList2.add(53);
        userAgeList2.add(2, 51);

        System.out.println();
        System.out.println(userAgeList2.size());

        userAgeList2.remove(3);

        System.out.println(userAgeList2.contains(12));

        System.out.println(userAgeList2.indexOf(12));

        System.out.println(userAgeList2.get(2));

        Integer[] userAgeArray2 = userAgeList2.toArray(new Integer[0]);

        System.out.println(userAgeArray2[0]);
        System.out.println(userAgeList2);

        // Queue and Deque interfaces on LinkedLists

        LinkedList<Integer> userAgeList3 = new LinkedList<>();

        userAgeList3.add(40);
        userAgeList3.add(53);
        userAgeList3.add(45);
        userAgeList3.add(53);
        userAgeList3.add(2, 51);
        userAgeList3.remove(3);

        System.out.println();
        System.out.println(userAgeList3);

        // The poll() method returns the first element (also known as the head) of the list
        // and removes the element from the list.
        System.out.println(userAgeList3.poll());
        System.out.println(userAgeList3);

        // The peek() method is similar to the poll() method.
        // It returns the first element of the list but does not remove the element from the list.
        System.out.println(userAgeList3.peek());

    }
}

// ArrayList and LinkedList methods
// they both implement List interface
// BUT LinkedList also implements Queue and Deque interfaces