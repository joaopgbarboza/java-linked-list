package com.linked.list;

public class Main {

    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(0);


        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);


        myLinkedList.insert(1, 1);
        myLinkedList.reverse();


        myLinkedList.printList();


    }


}
