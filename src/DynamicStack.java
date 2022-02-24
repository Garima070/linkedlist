public class DynamicStack {
    int top=0;
    int capacity=1;
    int[] stack=new int[capacity];
    public void push(int data)
    {
        if(size()==capacity)
            expand();
            stack[top] = data;
            top++;
    }
    public void expand()
    {
        int length=size();
        int[] newStack=new int[capacity+1];
        System.arraycopy(stack,0,newStack,0,length);
        stack=newStack;
        capacity+=1;
    }
    public int pop()
    {
        int data = 0;
        if(isEmpty())
        {
            System.out.println("stack is underflow!!!!!");
        }
        else {
            top--;
            shrink();
        }
        return data;
    }
    public void shrink()
    {
        int length=size();
        int[] newStack=new int[capacity-1];
        System.arraycopy(stack,0,newStack,0,length);
        stack=newStack;
        capacity-=1;
    }
    public int peek()
    {
        int data;
        data=stack[top-1];
        return data;
    }
    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        return top<=0;
    }
    public void show()
    {
        for (int i:stack) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicStack nums=new DynamicStack();
        nums.push(10);
        nums.show();
        nums.push(8);
        nums.show();
        nums.push(12);
        nums.show();
        nums.push(13);
        nums.show();
        nums.push(14);
        nums.show();
        nums.push(15);
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
    }
}
