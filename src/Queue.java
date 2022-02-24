public class Queue {
    int[] queue=new int[5];
    int front=0;
    int rear=0;
    int size=0;
    public void eQueue(int data)
    {
        if(size==5)
            System.out.println("queue is full!!!!!!!!!!!");
        else {
            queue[rear] = data;
            rear++;
            size++;
        }
    }
     public int dQueue()
     {
         int data = queue[front];
         if((rear-1)==front)
             System.out.println("queue is empty!!!!!!!");
         else {
             front++;
             return data;
         }
         return 0;
     }
    public void show()
    {
        for (int i = front; i <size; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.eQueue(10);
        q.show();
        q.eQueue(11);
        q.show();
        q.eQueue(12);
        q.show();
        q.eQueue(13);
        q.show();
        q.eQueue(14);
        q.show();
        q.eQueue(15);
        q.show();
        System.out.println(q.dQueue());
        q.show();
        System.out.println(q.dQueue());
        q.show();
        System.out.println(q.dQueue());
        q.show();
        System.out.println(q.dQueue());
        q.show();
        System.out.println(q.dQueue());
        q.show();
        System.out.println("---------------------------");
        System.out.println(q.dQueue());
        q.show();

    }
}
