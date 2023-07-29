public class Stack {

    private int [] Stack;
    private int top;
    private int Capacity;


    public Stack(){
        Capacity= 4;
        Stack = new int[Capacity];
        top = -1;
    }
    public Stack(int Capacity){
        this.Capacity = 5;
        this. Stack = new int[Capacity];
        this.top = -1;
    }

    public int peek(){
        return Stack[top];
    }
    public boolean isempty(){
        return top == -1;
    }

    public boolean isfull(){
        return top == (Capacity-1);
    }

    public boolean push(int data){
        if (isfull()){
            return false;
        }

            Stack[++top] = data;
            return true;
        }

        public int pop () {
            if (isempty()) {
                return -1;
            }

            int data;
            data = Stack[top];
            Stack[top] = 0;
            top--;
            return data;

        }

        public void show(){

            for(int n: Stack){
                System.out.println(n);
            }

        }

    }


