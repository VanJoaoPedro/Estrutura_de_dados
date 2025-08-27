public interface Stackable {
       void push(Object element);
       Object pop();
       Object peek();

       boolean isEmpty();
       boolean isFull();
       String print();
}
