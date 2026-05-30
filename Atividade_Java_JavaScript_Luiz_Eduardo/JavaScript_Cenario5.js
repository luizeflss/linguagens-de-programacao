// O que faz: Simula uma tarefa assíncrona com atraso usando timer.
// Conceito: Event Loop, Promises e Async/Await.
// Diferença: JavaScript usa Promises e async/await para lidar com operações assíncronas. [cite: 391, 393, 394, 395, 396]

function simularTarefa() {
    return new Promise(resolve => {
        setTimeout(() => {
            resolve("Tarefa assíncrona finalizada usando Promises no JavaScript!");
        }, 1000); // Pausa de 1 segundo
    });
}

async function executar() {
    console.log("Aguardando a promise...");
    const resultado = await simularTarefa();
    console.log(resultado);
}

executar();