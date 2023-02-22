import javax.swing.*;

public class Pawn extends Piese{
    Pawn(char x,int y){
        super(x,y);
    }
    public static void createPawns(Panel frame){
        ImageIcon icon = new ImageIcon("D:/Сhess/images/blackPawn.png");
        JLabel lbl = new JLabel(icon);
        lbl.setBounds(5,5,310,310);
        frame.add(lbl);
    }
}
