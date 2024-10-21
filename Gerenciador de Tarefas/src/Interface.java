import Tarefas.CriarTarefa;

import java.util.Scanner;

public class Interface {
    Scanner sc = new Scanner(System.in);
    CriarTarefa tarefas = new CriarTarefa();

    public void face() {

        for(int i = 0; i < 100; i++){
            System.out.println("-----------------Gerenciador de Tarefas----------------- \n");
            System.out.println("(1) Adicionar Tarefa");
            System.out.println("(2) Remover Tarefa");
            System.out.println("(3) Atualizar Tarefa");
            System.out.println("(4) Visualizar tarefas");
            System.out.println("(5) Tarefas concluidas");
            System.out.println("(6) Sair");

            int op = sc.nextInt();

            switch(op) {
                case 1:
                    System.out.println("Adicionar Tarefa");
                    tarefas.Criar();
                    break;
                case 2:
                    System.out.println("Remover Tarefa");
                    tarefas.removerTarefa(tarefas);
                    break;
                case 3:
                    System.out.println("Atualizar Tarefa");
                    tarefas.atualizarTarefa(tarefas);
                    break;
                case 4:
                    tarefas.exibir();
                    break;
                case 5:
                    System.out.println("Tarefas concluidas");
                    tarefas.tarefasConcluidas(tarefas);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    i += 110;
                    break;
            }
        }

    }

}
