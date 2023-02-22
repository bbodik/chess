import javax.swing.*;
import java.awt.*;

public class Panel extends JFrame{
    private JPanel[][] squares;

    public Panel() {
        super("Chessboard");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));
        squares = new JPanel[8][8];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel square = new JPanel();
                if ((row + col) % 2 == 0) {
                    square.setBackground(Color.WHITE);
                } else {
                    square.setBackground(Color.GRAY);
                }
                squares[row][col] = square;
                add(square);
            }
        }
        setResizable(false);
        setBounds(50, 50,600,600);
        setVisible(true);
        Pawn.createPawns(this);
    }

}
