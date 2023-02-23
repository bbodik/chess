import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Frame() {
        super("chess");
        setLayout(null);
        setBounds(50, 50, 840, 660);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new ChessBoardPanel());
        setVisible(true);
    }
}

class ChessBoardPanel extends JPanel {
    private int size = 75;
    private Color lightColor = Color.LIGHT_GRAY;
    private Color darkColor = Color.BLACK;

    public ChessBoardPanel() {
        setBounds(210, 10, 600, 600);
        setOpaque(false);
        setLayout(null);
        setVisible(true);
        Pawn.createPawns(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = 75;
        int height = 75;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                int x = col * width;
                int y = row * height;

                if ((row + col) % 2 == 0) {
                    g.setColor(lightColor);
                } else {
                    g.setColor(darkColor);
                }
                g.fillRect(x, y, width, height);
            }
        }
    }
}
