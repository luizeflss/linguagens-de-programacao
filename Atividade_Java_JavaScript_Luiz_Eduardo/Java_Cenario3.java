// O que faz: Declara um método de saudação e o chama no bloco principal.
// Conceito: Encapsulamento de métodos.
// Diferença: Em Java, todas as funções (métodos) devem estar dentro de uma classe. [cite: 315, 316, 317, 318]

public class Java_Cenario3 {
    
    // O método precisa pertencer à classe
    public static void saudacao() {
        System.out.println("Olá de um método encapsulado em Java!");
    }

    public static void main(String[] args) {
        saudacao();
    }
}