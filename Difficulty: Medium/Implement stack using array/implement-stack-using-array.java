class myStack {
    
    int[] st;
    int top=-1;
    int size;

    public myStack(int n) {
        // Define Data Structures
        size=n;
        st = new int[size];
        
    }

    public boolean isEmpty() {
      
      return top==-1;
      
    }

    public boolean isFull() {
        // check if the stack is full
        return top==size-1;
        
    }

    public void push(int x) {
      
       if(!isFull())
       {
           st[++top]=x;
           
       }
      
      
    }

    public void pop() {
        // Removes an element from the top of the stack
       if(!isEmpty())
       {
          
           top--;
       }
       
      
    }

    public int peek() {
        // Returns the top element of the stack
        if(!isEmpty())
        {
           return st[top];
        }
        else {
            return -1;
        }
        
    }
}