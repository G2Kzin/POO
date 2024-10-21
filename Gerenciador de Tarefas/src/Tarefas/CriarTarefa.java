package Tarefas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

 // cria novas tarefas
public class CriarTarefa {
    Scanner sc = new Scanner(System.in);
    List <Tarefa> listaTarefas = new ArrayList<Tarefa>();
    private int tarefasFinalizadas = 0;

     public void Criar(){
        System.out.println("Qual o nome da nova tarefa: ");
        String nome = sc.nextLine();

        System.out.println("Pra quando é essa tarefa: ");
        String tempo = sc.nextLine();

        Tarefa tarefa1 = new Tarefa(nome, tempo);
        listaTarefas.add(tarefa1);

        System.out.println("O que essa tarefa faz: ");
        tarefa1.setOqFaz(sc.nextLine());
    }

    // mostra as terafas adicionadas
    public void exibir(){
        System.out.println("----------Listas de tarefas----------");
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa);
        }
    }

    // remove tarefas
    public void removerTarefa(CriarTarefa tarefa){
        System.out.println("Deseja remover alguma tarefa? ");
        String opcao = sc.nextLine();

        if(opcao.equalsIgnoreCase("sim")){
            exibir();
            System.out.println("Digite o nome de uma das tarefas para remover");
            String nome = sc.nextLine();

            boolean tarefaRemovida = false;
            Iterator<Tarefa> iterator = listaTarefas.iterator();

            while(iterator.hasNext()){
                Tarefa t = iterator.next();
                if(t.getNomeTarefa().equals(nome)){
                    iterator.remove();
                    tarefaRemovida = true;
                    System.out.println("Tarefa " + nome + " removida com sucesso!");
                    break;
                }
            }

            if(!tarefaRemovida){
                System.out.println("Tarefa " + nome + " não encontrada");
            }
        }
    }

    // atualiza tarefas
    public void atualizarTarefa(CriarTarefa tarefa) {
        System.out.println("Deseja atualizar alguma tarefa? ");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("sim")) {
            exibir();
            System.out.println("Digite o nome da nova tarefa que deseja atualizar: ");
            String nome = sc.nextLine();

            boolean tarefaEncontrada = false;
            Iterator<Tarefa> iterator = listaTarefas.iterator();

            while (iterator.hasNext()) {
                Tarefa t = iterator.next();
                if (t.getNomeTarefa().equals(nome)) {
                    tarefaEncontrada = true;

                    System.out.println("O que deseja atualizar nessa tarefa? ");
                    System.out.println("(1) Nome");
                    System.out.println("(2) Data");
                    System.out.println("(3) O que faz");
                    System.out.println("(4) Não atualizar nada");
                    int atualiza = sc.nextInt();
                    sc.nextLine();

                    switch (atualiza) {
                        case 1:
                            System.out.println("Qual o novo nome para esta tarefa: ");
                            String novoNome = sc.nextLine();
                            t.setNomeTarefa(novoNome);
                            System.out.println("Nome atualizado com sucesso!");
                            break;
                        case 2:
                            System.out.println("Qual a nova data para esta tarefa: ");
                            String novaData = sc.nextLine();
                            t.setData(novaData);
                            System.out.println("Data atualizada com sucesso!");
                            break;
                        case 3:
                            System.out.println("O que faz essa tarefa: ");
                            String novaOqFaz = sc.nextLine();
                            t.setOqFaz(novaOqFaz);
                            System.out.println("Descrição atualizada com sucesso!");
                            break;
                        case 4:
                            System.out.println("Nada foi atualizado.");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                }
            }

            if (!tarefaEncontrada) {
                System.out.println("Tarefa " + nome + " não encontrada.");
            }
        } else {
            System.out.println("Nenhuma tarefa foi atualizada.");
        }
    }

     public void tarefasConcluidas(CriarTarefa tarefa) {
         System.out.println("Deseja colocar uma tarefa como concluída? ");
         String opcao = sc.nextLine();

         if (opcao.equalsIgnoreCase("sim")) {
             exibir();

             System.out.println("Tarefas já finalizadas:");
             for (Tarefa t : listaTarefas) {
                 if (t.isConcluida()) {
                     System.out.println("- " + t.getNomeTarefa());
                 }
             }

             // total de tarefas finalizadas em quantidade
             System.out.println("Total de tarefas finalizadas: " + tarefasFinalizadas);

             System.out.println("Qual tarefa você concluiu? ");
             String concluida = sc.nextLine();

             boolean tarefaEncontrada = false;
             Iterator<Tarefa> iterator = listaTarefas.iterator();

             while (iterator.hasNext()) {
                 Tarefa t = iterator.next();
                 if (t.getNomeTarefa().equals(concluida)) {
                     tarefaEncontrada = true;

                     // Verifica se a tarefa já foi concluída
                     if (t.isConcluida()) {
                         System.out.println("A tarefa '" + t.getNomeTarefa() + "' já está marcada como concluída.");
                     } else {
                         t.setConcluida(true);
                         tarefasFinalizadas++;
                         System.out.println("A tarefa '" + t.getNomeTarefa() + "' foi marcada como concluída.");
                     }
                 }
             }

             if (!tarefaEncontrada) {
                 System.out.println("Tarefa '" + concluida + "' não encontrada.");
             }

             // Mostrar o total atualizado de tarefas concluídas
             System.out.println("O total de tarefas concluídas é: " + tarefasFinalizadas);
         } else {
             System.out.println("Nenhuma tarefa foi marcada como concluída.");
         }
     }


 }
