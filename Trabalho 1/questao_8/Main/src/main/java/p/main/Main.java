package p.main;



public class Main {

    public static void main(String[] args) {
        Paises china = new Paises("Brasil", "Brasilia", 9596961);
        Paises japao = new Paises("Japao", "Tokyo", 377975);
        Paises russia = new Paises("Argentina", "Buenos Aires", 17098242);
        Paises coreiadosul = new Paises("Coreia do Sul", "Seul", 100210);

        // Adicionando fronteiras
        china.adicionarFronteira(russia);
        china.adicionarFronteira(coreiadosul);

        japao.adicionarFronteira(coreiadosul);
        japao.adicionarFronteira(russia);

        System.out.println("Países que fazem fronteira com o Japão:");
        for (Paises fronteira : japao.getFronteiras()) {
            System.out.println(fronteira.getNome());
        }

        System.out.println("\nPaíses que são vizinhos comuns entre Japão e China:");
        for (Paises vizinho : japao.vizinhosComuns(china)) {
            System.out.println(vizinho.getNome());
        }
    }   
}
