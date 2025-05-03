package com.linked.list;

public class Main {

    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(0);


        myLinkedList.append(2);


        myLinkedList.insert(1, 1);

        System.out.println(myLinkedList.remove(0).value + "\n");

        myLinkedList.printList();


    }


}
