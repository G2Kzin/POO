
package p.restaurante;

import javax.swing.SwingUtilities;

public class Restaurante {

     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RestauranteUni();
            }
        }
        );
    }
}
