package minecraft;

import javax.swing.JFrame;

public class Janela extends JFrame {
    
    public Janela() {
        
        setTitle("Minecraft");
        setSize(514, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new PainelJogo());
        setVisible(true);
        
    }
    
}
