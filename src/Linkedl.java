 class LL {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
         head=newNode;
         return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void display(){
        if(head==null){
            System.out.println("your list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
       public void addlast(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null) {
               temp=temp.next;
            }
            temp.next = newNode;
        }
    }
public class Linkedl{
    public static void main(String[] args) {
        LL list=new LL();
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        list.display();
        list.addlast(4);
        list.display();
    }
}
