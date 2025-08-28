package DoubleStack;
public class DoubleStackMain {
    public class Main {
    public static void main(String[] args) {
        // Cria uma pilha dupla com tamanho 6
        DoubleStack ds = new DoubleStack(6);

        // Testando a pilha 1
        System.out.println("=== Testando Pilha 1 ===");
        ds.push1("A");
        ds.push1("B");
        ds.push1("C");
        System.out.println("Pilha 1: " + ds.print1());   // [A B C ]
        System.out.println("Topo Pilha 1: " + ds.peek1()); // C

        System.out.println("Pop Pilha 1: " + ds.pop1()); // C
        System.out.println("Pilha 1 após pop: " + ds.print1()); // [A B ]

        // Testando a pilha 2
        System.out.println("\n=== Testando Pilha 2 ===");
        ds.push2("X");
        ds.push2("Y");
        ds.push2("Z");
        System.out.println("Pilha 2: " + ds.print2());   // [Z Y X ]
        System.out.println("Topo Pilha 2: " + ds.peek2()); // Z

        System.out.println("Pop Pilha 2: " + ds.pop2()); // Z
        System.out.println("Pilha 2 após pop: " + ds.print2()); // [Y X ]

        // Testando conflito (encher as duas pilhas até se encontrarem)
        System.out.println("\n=== Testando Conflito das Pilhas ===");
        ds.push1("D");
        ds.push1("E");
        ds.push1("F"); // aqui pode encher dependendo do tamanho
        System.out.println("Pilha 1 final: " + ds.print1());
        System.out.println("Pilha 2 final: " + ds.print2());
    }
}
}