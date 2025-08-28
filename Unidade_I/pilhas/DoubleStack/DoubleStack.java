package DoubleStack;
import java.security.PublicKey;

public class DoubleStack implements DoubleStackable {
    private int pointerTop1 = 0;
    private int pointerTop2 = 0;
    private Object[] data;
    private int size;

    public DoubleStack(){
        this(10);
    }

    public DoubleStack(int size){
        pointerTop1 = -1;
        pointerTop2 = size -1;
        data = new Object[size];
        this.size = size;
    }

    @Override
    public void push1(Object element){
        if(!isFull1()){
            pointerTop1 ++;
            data[pointerTop1] = element;
        }else{
            System.out.println("Pilha Cheia");
        }
    }
    @Override
    public void push2(Object element){
        if (!isFull2()) { 
            data[pointerTop2] = element;
            pointerTop2 --;
        }else{
            System.out.println("Pilha Cheia");
        }
    }

    @Override
    public Object pop1(){
        Object temp = null;
        if(!isEmpty1()){
            temp = data[pointerTop1];
            pointerTop1--;
        }else{
            System.out.println("Pilha vazia");
        }
        return temp;
    }
    @Override
    public Object pop2(){
        Object temp = null;
        if(!isEmpty2()){
            pointerTop2 ++;
            temp = data[pointerTop2];
        }else{
            System.out.println("Pilha vazia");
        }
        return temp;
    }

    @Override
    public Object peek1(){
        Object temp = null;
        if(!isEmpty1()){
            temp = data[pointerTop1];
        }else{
            System.out.println("Pilha vazia");
        }
        return temp;
    }
    @Override
    public Object peek2(){
        Object temp = null;
        if(!isEmpty2()){
            temp = data[pointerTop2 + 1];
        }else{
            System.out.println("Pilha vazia");
        }
        return temp;
    }

    @Override
    public boolean isEmpty1(){
        return(pointerTop1 == -1);
    }

    @Override
    public boolean isEmpty2(){
        return(pointerTop2 == size -1);
    }

    @Override
    public boolean isFull1(){
        return(pointerTop1 + 1 == pointerTop2);
    }

    @Override 
    public boolean isFull2(){
        return(isFull1());
    }
    
    @Override
    public String print1(){
        String result = "[";
        for(int i = 0; i<=pointerTop1; i++){
            result+= data[i] + " ";
        }
        return result + "]";
    }
    
    @Override
    public String print2(){
        String result = "[";
        for(int i = size - 1; i > pointerTop2; i--){
            result+= data[i] + " ";
        }
        return result + "]";
    }

}
