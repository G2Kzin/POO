
package p.questao_4;

public class Main {
     public static void main(String[] args) {
        Veiculo.Motocicletas motocicletas = new Veiculo.Motocicletas("Branca", 160, 2018, 20000, 160);
        Veiculo.Carro carro = new Veiculo.Carro("Prata", 160, 2019, 45000, 4);
        Veiculo.Caminhao caminhao = new Veiculo.Caminhao("Preto", 500, 2020, 80000, 16000);


        System.out.println("\nMOTOCICLETA: \n");
        System.out.println("Cor:"+ motocicletas.getCor());
        System.out.println("Potência:"+ motocicletas.getPotencia());
        System.out.println("Ano:"+ motocicletas.getAno());
        System.out.println("Valor:"+ motocicletas.getValor());
        System.out.println("Cilindrada:"+ motocicletas.getCilidrada());


        System.out.println("\nCARRO: \n");
        System.out.println("Cor:"+ carro.getCor());
        System.out.println("Potencia:"+ carro.getPotencia());
        System.out.println("Ano:"+ carro.getAno());
        System.out.println("Valor:"+ carro.getValor());
        System.out.println("Número de Portas:"+ carro.getNumPortas());


        System.out.println("\nCAMINHAO \n");
        System.out.println("Cor:"+ caminhao.getCor());
        System.out.println("Potencia:"+ caminhao.getPotencia());
        System.out.println("Ano:"+ caminhao.getAno());
        System.out.println("Valor:"+ caminhao.getValor());
        System.out.println("Capacidade de Cargas:"+ caminhao.getCapCargas());

    }
}
