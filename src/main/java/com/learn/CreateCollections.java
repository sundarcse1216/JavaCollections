package com.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CreateCollections {
    public static void main(String args[]) {
        Collection list = new ArrayList();
        list.add(1);
        list.add("One");
        list.add("Two");
        list.add(1);

        System.out.println(list);

        Collection set = new HashSet();
        set.add(1);
        set.add("One");
        set.add("Two");
        set.add(1);
        set.add("Two");

        System.out.println(set);
    }
}
