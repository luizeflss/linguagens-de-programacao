// O que faz: Declara uma variável inteira, imprime, e tenta mudar seu tipo para texto.
// Conceito: Tipagem Forte.
// Diferença: Em Java, você precisa declarar o tipo da variável, e ela não pode mudar de tipo ao longo do programa. [cite: 262, 263, 264, 265, 266, 267, 268]

public class Java_Cenario1 {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("O número é: " + numero);
        
        // Se descomentar a linha abaixo, o código não compila (Erro de tipagem).
        // numero = "dez"; 
    }
}