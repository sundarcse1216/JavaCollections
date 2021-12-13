package com.learn;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.ArrayList;
import java.util.Collection;

public class CreateCollections {
    public static void main(String args[]) {
        Collection list = new ArrayList();
        list.add(1);
        list.add("One");

        System.out.println(list);
    }
}
