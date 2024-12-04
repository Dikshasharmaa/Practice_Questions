package org.example;
import java.util.*;

import org.w3c.dom.Node;

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
// Reverse link list through iterative way
    // public void reverselist(){
    //     Node preNode = head;
    //     Node currNode = head.next;
    //     while(currNode !=null){
    //         Node newNode = currNode.next;
    //         currNode.next = prev;
    //         prevNode = currNode;
    //         currNode = newNode;

    //     }
    //     head.next = null;
    //     head = preNode;
    // }

    // }


}
