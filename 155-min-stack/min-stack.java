class MinStack {

    private Deque<Integer> minStack;
    private Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty() || value <= minStack.peek()){
            minStack.push(value);
        }
    }

    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}


    