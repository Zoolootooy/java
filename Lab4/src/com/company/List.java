package com.company;

public class List {
    private Node head;
    private Node tail;

    boolean SHOW = false;

    public List(){
        head = null;
        tail = null;
    }

    public List (int data){
        add(data);
    }

    public List(int[] data){
        for (int i = 0; i < data.length; i++){
            add(data[i]);
        }
    }

    public List (List data){
        head = data.head;
    }


    private boolean isEmpty(){
        return head == null;
    }

    public boolean isEquals(List A){
        boolean b = true;

        Node t2 = A.head;
        Node t1 = head;

        if (Length(t1) == Length(t2)){
            while (t1 != null){
                if (t1.data != t2.data){
                    b = false;

                    if (SHOW)
                        System.out.println(t1.data + "|" + t2.data);

                    return b;
                }
                else {
                    t1 = t1.next;
                    t2 = t2.next;
                }
            }
        }
        else {
            b = false;
            System.out.println("Length is wrong");
        }

        if (b){
            if (SHOW)
                System.out.println("=");
        }
        return b;
    }

    public int Length(Node T){
        int c = 0;

        Node temp = T;
        while (temp != null){
            c++;
            temp = temp.next;
        }

        return c;
    }

    public void checkIntegrity(){
        Node temp = head;
        int c = 0;

        while (temp != null){
            temp = temp.next;
            c++;
        }

        if (c == Length(head))
            System.out.println("This list is intact.");
    }

    public void printLength(){
        System.out.println("Length = " + Length(head));
    }

    public void clear(){
        this.head = new List().head;
    }

    public int findMin(){
        int min = head.data;
        Node temp = head;

        while (temp != null){
            if (temp.data < min)
                min = temp.data;
            temp = temp.next;
        }

        return min;
    }

    public int findMax(){
        int max = head.data;
        Node temp = head;

        while (temp != null){
            if (temp.data > max)
                max = temp.data;
            temp = temp.next;
        }

        return max;
    }

    public List onlyPositive(){
        if(!isEmpty()){
            List MY = new List();
            Node temp = head;
            for (int i = 0; i < Length(head); i++){
                if (temp.data > 0){
                    MY.add(temp.data);
                }
                temp = temp.next;
            }
            return  MY;
        }
        else {
            return this;
        }
    }

    public List onlyNegative(){
        if(!isEmpty()){
            List MY = new List();
            Node temp = head;
            for (int i = 0; i < Length(head); i++){
                if (temp.data < 0){
                    MY.add(temp.data);
                }
                temp = temp.next;
            }
            return  MY;
        }
        else {
            return this;
        }
    }


    //Добавляет в начало
    public void addToHead(int data){
        Node temp = new Node(data);

        if (isEmpty()){
            tail = temp;
        }
        else {
            head.prev = temp;
        }

        temp.next = head;
        head = temp;
    }

    //Добавляет в конец
    public void add(int data){
        Node temp = new Node(data);
        if (isEmpty()){
            head = temp;
        }
        else {
            tail.next = temp;
        }

        temp.prev = tail;
        tail = temp;
    }

    //Добавляет по индексу (начало отсчёта - 0)
    public void add(int data, int index){
        if (index < 0){
            System.out.println("You enter " + index + " position. It's stupid!");
            System.out.println("The adding isn't possible");
        }
        else  {
            if (index == 0){
                addToHead(data);
            }
            else {
                if (index < Length(head)){
                    Node cur = head;
                    int c = 0;

                    while (cur != null && c != index){
                        cur = cur.next;
                        c++;
                    }

                    Node temp = new Node(data);

                    cur.prev.next = temp;
                    temp.prev = cur.prev;
                    cur.prev = temp;
                    temp.next = cur;
                }
                else {
                    if (index == Length(head)){
                        add(data);
                    }
                    else {
                        System.out.println("This List is shorter. The adding on " + index + " position isn't possible");
                    }
                }
            }
        }
    }

    //Добавляет список элементов в конец списка
    public void add(List data){
        Node temp = data.head;

        while (temp != null){
            add(temp.data);

            temp = temp.next;
        }
    }

    //Добавляет список элементов по индексу (начало отсчёта - 0)
    public void add(List data, int index){
        if (index < 0){
            System.out.println("You enter " + index + " position. It's stupid!");
            System.out.println("The adding isn't possible");
        }
        else {
            if (index <= Length(head)){
                Node temp = data.head;
                while (temp != null){
                    add(temp.data, index);

                    index++;
                    temp = temp.next;
                }
            }
            else {
                System.out.println("This List is shorter. The adding on " + index + " position isn't possible");
            }
        }
    }


    //Удаляет первый
    public void removeFromHead(){
       if (head.next == null){
           tail = null;
       }
       else {
           head.next.prev = null;
       }
       head = head.next;
    }

    //Удаляет последний с конца
    public void remove(){

        if (head.next == null){
            head = null;
        }
        else {
            tail.prev.next = null;
        }

        tail = tail.prev;
    }

    //Удаляет в заданной позиции
    public void remove (int index){
        if (index < 0){
            System.out.println("You enter " + index + " position. It's stupid!");
            System.out.println("The adding isn't possible");
        }
        else{
            if (index == 0){
                removeFromHead();
            }
            else {
                if (index < Length(head)){
                    Node cur = head;
                    int c = 0;
                    while (cur != null && c != index){
                        cur = cur.next;
                        c++;
                    }

                    cur.prev.next = cur.next;
                    if (SHOW)
                        System.out.println("Was removed "+cur.data);

                    for (int i = 0; i < c; i++){
                        cur = cur.prev;
                    }


                    List MY = new List();
                    while (cur != null){
                        MY.add(cur.data);
                        cur = cur.next;
                    }
                    head = MY.head;
                }
                else {
                    if (index == Length(head)){
                        remove();
                    }
                    else {
                        System.out.println("This List is shorter. The removing from " + index + " position isn't possible");
                    }
                }
            }
        }
    }

    public void removeForKey(int key){
        Node temp = head;

        while (temp != null){
            if (temp.data == key){
                if (temp == head){
                    head = temp.next;
                }
                else {
                    temp.prev.next = temp.next;
                }
            }
            temp = temp.next;
        }
    }

    public void  removeForKey(List L){
        if (Length(L.head) <= Length(head)){
            Node temp = L.head;
            Node t = head;
            Node t1 = head;
            List res = this;
            int c = 0;

           for (int i = 0; i <= Length(head)-Length(L.head); i++){
               List MY = new List();
               t = t1;
               if (SHOW)
                   System.out.println("i = " + i);

               for (int j = 0; j < Length(L.head); j++){
                   MY.add(t.data, j);
                   if (SHOW){
                       System.out.println("!_____");
                       MY.print();
                       System.out.println("_____!");
                       System.out.println("j = " + j);
                   }

                   t = t.next;
               }

               if (MY.isEquals(L)){
                   for (int k = 0; k < Length(L.head); k++){
                       res.remove(i);
                       c++;
                       if (SHOW){
                           System.out.println("k = " + k);
                           System.out.println("|++");
                           res.print();
                           System.out.println("++|");
                       }

                   }
               }
               MY.clear();
               t1 = t1.next;
               if (SHOW)
                   System.out.println();
           }

           if (c == 0){
               System.out.println("There is no such List. The removing isn't done.");
           }
           head = res.head;
        }
        else {
            System.out.println("This List is shorter then KeyList. The removing isn't possible");
            //temp = temp.next;
        }
    }


    public void print(){
        Node temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
