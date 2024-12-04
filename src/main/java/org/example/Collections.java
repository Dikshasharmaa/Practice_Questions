package org.example;
import java.util.*;

public class Collections {

    public void LinkList(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Hi");
        list.add("name");
        list.addFirst("hey");
        list.add(1,"my");
        list.remove(0);

        System.out.println(list);
    }


}
