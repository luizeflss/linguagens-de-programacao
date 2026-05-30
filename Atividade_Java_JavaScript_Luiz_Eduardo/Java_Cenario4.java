// O que faz: Cria uma classe Pessoa com construtor e um método, depois instancia um objeto.
// Conceito: Programação Orientada a Objetos clássica.
// Diferença: Java usa classes e objetos para orientação a objetos de forma mais rígida. [cite: 338]

public class Java_Cenario4 {
    String nome;

    // Construtor
    public Java_Cenario4(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " (Instância Java)");
    }

    public static void main(String[] args) {
        Java_Cenario4 pessoa = new Java_Cenario4("Luiz");
        pessoa.apresentar();
    }
}