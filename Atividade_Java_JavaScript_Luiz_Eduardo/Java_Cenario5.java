// O que faz: Executa uma tarefa em segundo plano simulando um atraso.
// Conceito: Multithreading.
// Diferença: Java lida com tarefas assíncronas principalmente através de threads. [cite: 366, 367, 368, 369, 370]

public class Java_Cenario5 extends Thread {
    public void run() {
        try {
            Thread.sleep(1000); // Pausa de 1 segundo
            System.out.println("Tarefa assíncrona finalizada usando Threads no Java!");
        } catch (InterruptedException e) {
            System.out.println("Erro na thread.");
        }
    }

    public static void main(String[] args) {
        Java_Cenario5 tarefa = new Java_Cenario5();
        tarefa.start(); // Inicia a execução paralela
        System.out.println("Aguardando a thread...");
    }
}