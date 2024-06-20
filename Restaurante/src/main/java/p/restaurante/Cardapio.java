
package p.restaurante;


public class Cardapio {

    static Iterable<String> getModel() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
        public java.util.List<String> comidas;
        public java.util.List<String> bebidas;

        public Cardapio() {
            comidas = new java.util.ArrayList<>();
            bebidas = new java.util.ArrayList<>();
        }

        public void addComida(String comida) {
            comidas.add(comida);
        }

        public void addBebida(String bebida) {
            bebidas.add(bebida);
        }

        public String getComidas() {
            return String.join(", ", comidas);
        }

        public String getBebidas() {
            return String.join(", ", bebidas);
        }
    }
