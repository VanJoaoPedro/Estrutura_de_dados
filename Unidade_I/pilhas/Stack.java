public class Stack implements Stackable {
    private int pointerTop;
    private Object[] data;
    private int size;

    public Stack(){
        this(10);
    }

    public Stack(int size){
        pointerTop = -1;
        data = new Object[size];
        this.size = size;
    }

    @Override
    public void push(Object element){
        if(!isFull()){
            pointerTop ++;
            data[pointerTop] = element;
        }else{
            System.out.println("Pilha Cheia");
        }
    }

    @Override
    public Object pop(){
        Object temp = null;
        if(!isEmpty()){
            temp = data[pointerTop];
            pointerTop --;
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
        return(pointerTop == -1);
    }

    @Override
    public boolean isFull(){
        return(pointerTop == size - 1);
    }

    @Override
    public String print(){
        String result = "[";
        for(int i = 0; i<=pointerTop;i++){
            result += data[i] + " ";
        }
        return result + "]";
    }
}
