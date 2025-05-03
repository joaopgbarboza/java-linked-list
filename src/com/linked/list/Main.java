package com.linked.list;

public class Main {

    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(0);

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);


        System.out.println(myLinkedList.get(2).value + "\n");

        myLinkedList.printList();


    }


}
