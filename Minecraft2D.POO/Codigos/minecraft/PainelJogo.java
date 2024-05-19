package minecraft;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PainelJogo extends JPanel implements KeyListener {

    private int lnBoneco = 0, coBoneco = 6;
    private BufferedImage personagem;
    private BufferedImage terra, grama, pedra, picareta, flor;
    private int tamanhoPixel = 50;
    private Boolean paraFrente = true;
    private int objSelecionado = 0;

    List< List<Integer>> mapa = new ArrayList();

    public PainelJogo() {
        inicializaMapa();
        setBackground(Color.cyan);
        addKeyListener(this);
        setFocusable(true);

        try {
            personagem = ImageIO.read(getClass().getResource("personagem.png"));
            grama = ImageIO.read(getClass().getResource("grama.png"));
            pedra = ImageIO.read(getClass().getResource("pedra.png"));
            terra = ImageIO.read(getClass().getResource("terra.png"));
            picareta = ImageIO.read(getClass().getResource("picaretadois.png"));
            flor = ImageIO.read(getClass().getResource("flor.png"));
        } catch (IOException ex) {
            Logger.getLogger(PainelJogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        pintaMapa(g2);
        pintaPersonagem(g2);
        pintaInvertario(g2);
    }

    private void pintaMapa(Graphics2D g2) {
        for (int i = 0; i < mapa.size(); i++) {
            for (int j = 0; j < mapa.get(i).size(); j++) {
                // System.out.print(mapa.get(i).get(j));
                if (mapa.get(i).get(j) == 1) {
                    g2.drawImage(grama, j * tamanhoPixel, i * tamanhoPixel, tamanhoPixel, tamanhoPixel, null);
                }
                if (mapa.get(i).get(j) == 2) {
                    g2.drawImage(terra, j * tamanhoPixel, i * tamanhoPixel, tamanhoPixel, tamanhoPixel, null);
                }
                if (mapa.get(i).get(j) == 3) {
                    g2.drawImage(pedra, j * tamanhoPixel, i * tamanhoPixel, tamanhoPixel, tamanhoPixel, null);
                }

                if (mapa.get(i).get(j) == 4) {
                    g2.drawImage(flor, j * tamanhoPixel, i * tamanhoPixel, tamanhoPixel, tamanhoPixel, null);
                }
            }
        }
    }

    private void pintaPersonagem(Graphics2D g2) {
        if (paraFrente) {
            //imagem espelhada
            g2.drawImage(personagem, tamanhoPixel + (lnBoneco * tamanhoPixel), (coBoneco * tamanhoPixel), -tamanhoPixel, tamanhoPixel, null);
            g2.drawRect((lnBoneco + 1) * tamanhoPixel, coBoneco * tamanhoPixel, tamanhoPixel, tamanhoPixel);
        } else {
            g2.drawImage(personagem, lnBoneco * tamanhoPixel, coBoneco * tamanhoPixel, tamanhoPixel, tamanhoPixel, null);
            g2.drawRect((lnBoneco - 1) * tamanhoPixel, coBoneco * tamanhoPixel, tamanhoPixel, tamanhoPixel);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (paraFrente) {
                paraFrente = false;
            } else {
                if (podeCaminhar()) {
                    lnBoneco--;
                }

            }

            aplicaGravidade();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (!paraFrente) {
                paraFrente = true;
            } else {
                if (podeCaminhar()) {
                    lnBoneco++;
                }

            }
            aplicaGravidade();
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            //so posso pular se nao puder caminhar
            if (!podeCaminhar()) {
                coBoneco--;
                if (podeCaminhar()) {
                    if (paraFrente) {
                        lnBoneco++;
                    } else {
                        lnBoneco--;
                    }
                }
                aplicaGravidade();
            }

        }

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (paraFrente) {
                    mapa.get(coBoneco).set(lnBoneco + 1, objSelecionado);

                } else {
                    mapa.get(coBoneco).set(lnBoneco - 1, objSelecionado);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Atingiu o limite da Matriz!");
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_0) {
            System.out.println("Objeto selecionado: Espada");
            objSelecionado = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_1) {
            System.out.println("Objeto selecionado: Grama");
            objSelecionado = 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            System.out.println("Objeto selecionado: Terra ");
            objSelecionado = 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
            System.out.println("Objeto selecionado: Pedra");
            objSelecionado = 3;
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            System.out.println("Objeto selecionado: Flor");
            objSelecionado = 4;
        }

        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void inicializaMapa() {
        //matriz
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 1, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 2, 1));
        mapa.add(Arrays.asList(1, 1, 0, 0, 0, 0, 1, 1, 3, 2));
        mapa.add(Arrays.asList(2, 2, 1, 1, 0, 1, 2, 3, 3, 3));
        mapa.add(Arrays.asList(2, 2, 2, 2, 1, 2, 2, 2, 2, 2));

    }

    public void aplicaGravidade() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try { //tente rodar o comando
                    //enquanto nao existir elemento desce
                    while (mapa.get(coBoneco + 1).get(lnBoneco) == 0) {
                        coBoneco++;
                        Thread.sleep(30);
                        repaint();
                    }
                    //se der erro:
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Atingiu o limite da Matriz!");

                } catch (InterruptedException ex) {
                    Logger.getLogger(PainelJogo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    public boolean podeCaminhar() {
        try {
            if (paraFrente) {
                if (mapa.get(coBoneco).get(lnBoneco + 1) == 0) {
                    return true;
                }

            } else {
                if (mapa.get(coBoneco).get(lnBoneco - 1) == 0) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Atingiu o limite da Matriz!");
            return false;
        }

    }

    //mostrar os elementos na tela
    private void pintaInvertario(Graphics2D g) {
        g.drawRect(200 + 50, 0, 250, 65);

        defineCorInventario(g, 0);
        g.drawImage(picareta, 255, 5, 40, 40, null);
        g.drawString("0", 270, 60);

        defineCorInventario(g, 1);
        g.drawImage(grama, 305, 5, 40, 40, null);
        g.drawString("1", 320, 60);

        defineCorInventario(g, 2);
        g.drawImage(terra, 355, 5, 40, 40, null);
        g.drawString("2", 370, 60);

        defineCorInventario(g, 3);
        g.drawImage(pedra, 405, 5, 40, 40, null);
        g.drawString("3", 420, 60);

        defineCorInventario(g, 4);
        g.drawImage(flor, 405 + 50, 5, 40, 40, null);
        g.drawString("4", 420 + 50, 60);

    }

    public void defineCorInventario(Graphics2D g, int qualVaiRenderizar) {
        if (objSelecionado == qualVaiRenderizar) {
            g.setColor(Color.RED);
            g.setFont(new Font("TimesRoman", Font.BOLD, 14));

        } else {
            g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 12));

        }

    }

}
