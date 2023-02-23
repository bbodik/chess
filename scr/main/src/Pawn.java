import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pawn extends Piese {
    Pawn(Icon icon, char cordX, char cordY, boolean white) {
        super(icon, cordX, cordY, white);
    }

    public static void createPawns(ChessBoardPanel frame) {
        BlackHandler hnd = new BlackHandler();
        WhiteHandler hnd1 = new WhiteHandler();
        for (int i = 0; i < 8; i++) {
            ImageIcon icon = new ImageIcon("D:/Сhess/scr/images/blackPawn.png");
            Pawn pawn = new Pawn(icon, (char) (97 + i), '2', false);
            pawn.setBounds(i * 75, 75, 75, 75);
            pawn.addActionListener(hnd);
            frame.add(pawn);
        }
        for (int i = 0; i < 8; i++) {
            ImageIcon icon = new ImageIcon("D:/Сhess/scr/images/whitePawn.png");
            Pawn pawn = new Pawn(icon, (char) (97 + i), '7', true);
            pawn.setBounds(i * 75, 450, 75, 75);
            pawn.addActionListener(hnd1);
            frame.add(pawn);
        }
    }

}

class BlackHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Pawn button = (Pawn) e.getSource();
        button.setLocation(button.getX(),button.getY()+75);
    }
}

class WhiteHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Yeea it working");
    }
}
