// O que faz: Cria um objeto usando a sintaxe de classe do ES6.
// Conceito: Orientação a Objetos baseada em protótipos (com syntax sugar de classe).
// Diferença: JavaScript permite criar objetos sem classes, usando protótipos ou a palavra-chave class. [cite: 351, 353, 355, 357, 358, 360, 362]

class Pessoa {
    constructor(nome) {
        this.nome = nome;
    }

    apresentar() {
        console.log("Olá, meu nome é " + this.nome + " (Objeto JS)");
    }
}

const pessoa = new Pessoa("Luiz");
pessoa.apresentar();