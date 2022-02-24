public class stack1 {
    int top=0;
    int[] stack=new int[5];
    public void push(int data)
    {
        if(top>=5)
        {
            System.out.println("stack is overflow!!!!!!!!!");
        }
        else {
            stack[top] = data;
            top++;
        }
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
            data = stack[top];
            stack[top] = 0;
        }
        return data;
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
        stack1 nums=new stack1();
        System.out.println("empty "+nums.isEmpty());
        nums.push(10);
        nums.push(8);
        System.out.println(nums.peek());
        nums.push(9);
        System.out.println(nums.pop());
        nums.push(13);
        nums.push(15);
        nums.push(17);
        nums.show();
        nums.push(19);
        System.out.println("size of stack: "+nums.size());
        System.out.println("empty "+nums.isEmpty());
        System.out.println(nums.pop());
        nums.show();
        System.out.println(nums.pop());
        nums.show();
        System.out.println(nums.pop());
        nums.show();
        System.out.println(nums.pop());
        nums.show();
        System.out.println(nums.pop());
        nums.show();
        System.out.println("size of stack: "+nums.size());
        System.out.println("empty "+nums.isEmpty());
        nums.pop();
    }
}
