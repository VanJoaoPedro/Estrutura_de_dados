public class StackMain {
    public static void main(String[] args) {
        Stackable stack = new StackInverse(5);
        stack.push("Joao");
        stack.push("Pedro");
        stack.push("Silva");
        String str = (String) stack.pop();
        System.out.println("Pilha =" + stack.print());
    }
}
