import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pawn extends Piese {
    Pawn(Icon icon, char cordX, char cordY, boolean white) {
        super(icon, cordX, cordY, white);
    }

    public static void createPawns(ChessBoardPanel frame) {
        BlackPawnHandler hnd = new BlackPawnHandler();
        WhitePawnHandler hnd1 = new WhitePawnHandler();
        for (int i = 0; i < 8; i++) {
            ImageIcon icon = new ImageIcon("D:/chess/scr/images/blackPawn.png");
            Pawn pawn = new Pawn(icon, (char) (97 + i), '2', false);
            pawn.setBounds(i * SIZE_OF_SQUARE, SIZE_OF_SQUARE, SIZE_OF_SQUARE, SIZE_OF_SQUARE);
            pawn.addActionListener(hnd);
            frame.add(pawn);
        }
        for (int i = 0; i < 8; i++) {
            ImageIcon icon = new ImageIcon("D:/chess/scr/images/whitePawn.png");
            Pawn pawn = new Pawn(icon, (char) (97 + i), '7', true);
            pawn.setBounds(i * SIZE_OF_SQUARE, 450, SIZE_OF_SQUARE, SIZE_OF_SQUARE);
            pawn.addActionListener(hnd1);
            frame.add(pawn);
        }
    }
}

class BlackPawnHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class WhitePawnHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Yeea it working");
    }
}

