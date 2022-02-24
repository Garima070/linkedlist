public class queue1 {
    int[] queue=new int[5];
    int front=0;
    int rear=0;
    int size=0;
    public void eQueue(int data)
    {
        if(!(getFull())) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        }
        else
            System.out.println("queue is full!!!!!!!!!!!!");
    }
    public int dQueue()
    {
        size--;
        int data = queue[front];
        if(!(getEmpty())) {
            front = (front + 1) % 5;
        }
        else
            System.out.println("queue is empty!!!!!!!");
            return data;
    }
    public void show()
    {
        System.out.print("elements:");
        for (int i = front; i <size; i++) {
            System.out.print(queue[i%5]+" ");
        }
        System.out.println();
        for(int n:queue)
            System.out.print(n+" ");
    }
    public int getSize()
    {
        return  size;
    }
    public boolean getEmpty()
    {
        return size==0;
    }
    public boolean getFull()
    {
        return size==5;
    }
    public static void main(String[] args) {
        queue1 q=new queue1();
        System.out.println(q.getEmpty());
        q.eQueue(5);
        q.eQueue(2);
        q.eQueue(7);
        q.eQueue(3);
   //   q.dQueue();
   //   q.dQueue();
        q.eQueue(9);
        q.eQueue(1);
        System.out.println("size="+q.getSize());
        q.show();
        System.out.println(q.getEmpty());
        q.dQueue();
        q.dQueue();
        q.dQueue();
        q.dQueue();
        q.dQueue();
        q.dQueue();
    }
}
