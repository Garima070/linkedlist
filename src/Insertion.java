public class Insertion {
    class Node
    {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    private int size;
    Node head=null;
    void Insertion()
    {
        this.size=0;
    }

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
       // System.out.print(curnode.data+" -> ");
        while (curnode!=null)
        {
            System.out.print(curnode.data+" -> ");
            curnode=curnode.next;
        }
        System.out.println("NULL");
    }

    //delete-first

    public void deletefirst()
    {
        if(head==null)
            System.out.println("the liat is empty");
        size--;
        head=head.next;
    }

    //find size of list
    public int size1()
    {
        return size;
    }

    //delete-last
    public void deletelast()
    {
        if(head==null) {
            System.out.println("the liat is empty");
            return;
        }
        size--;
        if(head.next==null) {
            head=null;
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null)
        {
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
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
        list.deletefirst();
        list.printlist();
        list.deletelast();
        list.printlist();
        System.out.println(list.size1());
        list.addfirst("this");
        list.printlist();
        System.out.println(list.size1());
    }
}
