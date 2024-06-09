
package p.restaurante;

public class ItemCardapio {
    
 private String nome;
    private String tipo; // "Comida" ou "Bebida"

    public ItemCardapio(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo + ": " + nome;
    }
}
