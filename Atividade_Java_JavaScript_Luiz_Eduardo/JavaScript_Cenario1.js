// O que faz: Declara uma variável com número, imprime, e depois muda para texto.
// Conceito: Tipagem Fraca / Dinâmica.
// Diferença: Em JavaScript, as variáveis podem mudar de tipo dinamicamente. [cite: 281]

let numero = 10;
console.log("O número é: " + numero);

// Em JS, a mesma variável pode receber uma string sem gerar erro.
numero = "dez";
console.log("Agora o número virou texto: " + numero);