import java.util.Arrays;

import ex3_tp1.CustomArrayList;

public class testex3 {
    public static void main(String[] args) 
    {
        CustomArrayList list = new CustomArrayList();
        System.out.println("Is list empty? " + list.isEmpty());
        
        list.add(5);
        list.add(10);
        list.add(15);
        System.out.println("List after adding elements: " + Arrays.toString(list.getArrayList()));
        //CustomArrayList list2 = new CustomArrayList(-5);
        // System.out.println(Arrays.toString(list2.getArrayList()));
        // CustomArrayList list3 = new CustomArrayList(0);
        //System.out.println(Arrays.toString(list3.getArrayList()));
        

        list.add(200, 99);
        //list.add(-1, 0);
        list.add(1, 7);
        System.out.println("List after adding element at index 1 and index 200: " + Arrays.toString(list.getArrayList()));

        
        int element = list.get(2);
        System.out.println("Element at index 2: " + element);

        
        System.out.println("Is list empty? " + list.isEmpty());

        
        System.out.println("Is 10 in the list? " + list.isIn(10));

        list.add(7);
        System.out.println(Arrays.toString(list.getArrayList()));
        int index = list.find(7);
        System.out.println("Index of 7 in the list: " + index);
        
        list.add(10);
        list.remove(10);
        System.out.println("List after removing 10: " + Arrays.toString(list.getArrayList()));
    }
}
