import java.util.LinkedList;

public class Insertion {
    class Node
    {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head=null;
    //add-first
    public  void addfirst(String data)
    {
        Node newnode=new Node(data);
        if(head==null) {
            head = newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    //add-last
    public void addlast(String data)
    {
        Node newnode=new Node(data);
        if(head==null) {
            head = newnode;
            return;
        }
        Node curnode=head;
        while (curnode.next!=null)
        {
            curnode=curnode.next;
        }
        curnode.next=newnode;
    }

    //printlist
    public void printlist()
    {
        if(head==null) {
            System.out.println("linked list is empty!!");
            return;
        }
        Node curnode=head;
        System.out.print(curnode.data+" -> ");
        while (curnode.next!=null)
        {
            curnode=curnode.next;
            System.out.print(curnode.data+" -> ");
        }
        System.out.println("NULL");
    }
    public static void main(String[] args)
    {
        Insertion list =new Insertion();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        list.addlast("list");
        list.printlist();
        list.addfirst("this");
        list.printlist();
    }
}
