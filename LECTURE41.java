class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class MyLL{

    static void print(Node head)
    {
        while(head != null)// here it is correct to use head as 
        //this head is a seperate refernece variable head
        {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    } 

    static Node  insertAtHead(Node head, int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return head;
    }
    public static void main(String [] args)
    {
        Node head = new Node(5);
        Node second = new Node(6);
        head.next = second;
        Node third = new Node(7);
        second.next = third;
        Node fourth = new Node(8);
        third.next = fourth;
        Node fifth = new Node(9);
        fourth.next = fifth;
    //     System.out.println(head.data);
    //     System.out.println(head.next.data);
    //     System.out.println(head.next.next.data);
    //     System.out.println(head.next.next.next.data);
    //     System.out.println(head.next.next.next.next.data);
    //  // System.out.println(head.next.next.next.next.next.data);// null data -> wrong
        
    Node temp = head;
        while (temp != null) 
        {
            System.out.println(temp.data);
            temp = temp.next; 
        }
        System.out.println(temp);//head
        //head has become null -> we have mispplaced our head

        while (head.next != null) 
        {
            System.out.println(head.data);
            head = head.next;  
        }
        System.out.println(head);

        print(head);
        print(head);
        
        head = insertAtHead(head, 4);
        print(head);
    }
}