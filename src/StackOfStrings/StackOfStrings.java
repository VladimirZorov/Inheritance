package StackOfStrings;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class StackOfStrings extends ArrayDeque {

    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<String>();
    }

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        String element = data.get(0);
        data.remove(0);
        return element;
    }

    public String peek() {
        String elementPeek = data.get((data.size()-1));
        return elementPeek;
    }

}
