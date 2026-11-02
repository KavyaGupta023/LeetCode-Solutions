class MyStack {
    Queue<Integer> q1=new ArrayDeque<>();
    Queue<Integer> q2=new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
       while(q1.size()>1){
        q2.offer(q1.poll());
       }
       int x=q1.poll();
       Queue<Integer> temp=q1;
       q1=q2;
       q2=temp;
        return x;
    }
    
    public int top() {
        while(q1.size()>1){
        q2.offer(q1.poll());
       }
       int x=q1.peek();
       q2.offer(q1.poll()); 
       Queue<Integer> temp=q1;
       q1=q2;
       q2=temp;
       return x;
    }
    
    public boolean empty() {
        if(q1.isEmpty()) return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */