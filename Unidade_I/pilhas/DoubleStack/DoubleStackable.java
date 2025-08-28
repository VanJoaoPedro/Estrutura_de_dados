package DoubleStack;
public interface DoubleStackable {
       void push1(Object element);
       void push2(Object element);
       Object pop1();
       Object pop2();
       Object peek1();
       Object peek2();

       boolean isEmpty1();
       boolean isEmpty2();
       boolean isFull1();
       boolean isFull2();
       String print1();
       String print2();
}
