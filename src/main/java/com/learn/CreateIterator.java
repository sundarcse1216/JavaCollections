package com.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CreateIterator {

    public static void main(String args[]) {
        Collection list = new ArrayList();
        list.add(1);
        list.add("One");
        list.add("Two");
        list.add(1);

        System.out.println(list);
        Iterator item = list.iterator();

//        System.out.println(item.next());
//        System.out.println(item.next());
//        System.out.println(item.next());
//        System.out.println(item.next());
//        System.out.println(item.next());

        while (item.hasNext()) {
            System.out.println(item.next());
            item.remove();
        }
        System.out.println(list);
    }
}
