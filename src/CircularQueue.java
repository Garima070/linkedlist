import java.util.Scanner;
public class CircularQueue {
    int ar[];
    int front,rear;
    CircularQueue()
    {
        ar = new int[5];
        front = -1;
        rear = -1;

    }
    void insert()
    {
        if((front==0 && rear==ar.length-1) || rear+1==front)
        {
            System.out.println("circular queue full");
        }
        else
        {
            System.out.println("enter data");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            if(front == -1)
            {
                front =0;
            }
            if(rear<ar.length-1)
            {
                rear = rear+1;
                ar[rear]=data;
            }
            else if(rear == ar.length-1 && front!=0)
            {
                rear =0;
                ar[rear] = data;
            }
            System.out.println("data inserted");
        }
    }
    void delete()
    {
        if(front ==-1)
        {
            System.out.println("circualr list empty");
        }
        else
        {
            System.out.println("deleted" + ar[front]);
            if(front == rear)
            {
                front = -1;
                rear = -1;
            }
            else if(front<rear)
            {
                front = front+1;
            }
        }
    }
    void traverse()
    {
        if(front == -1)
        {
            System.out.println("circular queue empty!!!");
        }
        else
        {
            if(front <= rear)
            {
                for(int i =front;i<=rear;i++)
                {
                    System.out.println(" "+ar[i]);
                }
            }
            else if(front>rear)
            {
                for(int i = front-1;i<=ar.length-1;i++)
                {
                    System.out.println(" "+ar[i]);
                }
                for(int i=0;i<=rear;i++)
                {
                    System.out.println(" "+ar[i]);
                }
            }
        }

    }

    public static void main(String[] args)
    {
        CircularQueue obj=new CircularQueue();
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");

            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:obj.insert();
                    break;
                case 2:obj.delete();
                    break;
                case 3:obj.traverse();
                    break;
                case 4: System.exit(0);
                    break;
                default: System.out.println("Wrong Input.......");
            }

        }
    }
}