public class StackInverse implements Stackable {
    private int pointerTop = 0;
    private Object[] data;
    private int size;

    public StackInverse(){
        this(10);
    }

    public StackInverse(int size){
        pointerTop = size - 1;
        data = new Object[size];
        this.size = size;

    }
    @Override
    public void push(Object element){
        if(!isFull()){
            data[pointerTop] = element;
            pointerTop --;
        }else{
            System.out.println("Pilha Cheia");
        }
    }

    @Override
    public Object pop(){
        Object temp = null;
        if(!isEmpty()){
            temp = data[pointerTop];
            pointerTop ++;
        }else{
            System.out.println("Pilha vazia");
        }
        return temp;
    }

    @Override
    public Object peek(){
        Object temp = null;
        if(!isEmpty()){
            temp = data[pointerTop];
        }else{
           System.out.println("Pilha vazia"); 
        }
        return temp;
    }

    @Override
    public boolean isEmpty(){
        return(pointerTop == size -1);
    }

    @Override
    public boolean isFull(){
        return(pointerTop == -1);
    }

    @Override
    public String print() {
        String result = "[";
        for (int i = size - 1; i > pointerTop; i--) {
            result += data[i] + " ";
        }
        return result + "]";
    }

}
