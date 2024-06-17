
package p.restaurante;

import java.util.ArrayList;
import java.util.List;

public class CardapioDiario {
    
    private String diaSemana;
    private List<ItemCardapio> itens;

    public CardapioDiario(String diaSemana) {
        this.diaSemana = diaSemana;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    public void removerItem(ItemCardapio item) {
        itens.remove(item);
    }

    public void atualizarItem(ItemCardapio antigo, ItemCardapio novo) {
        int index = itens.indexOf(antigo);
        if (index != -1) {
            itens.set(index, novo);
        }
    }

    public List<ItemCardapio> getItens() {
        return itens;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    @Override
    public String toString() {
        return diaSemana + ": " + itens.toString();
    }
}
