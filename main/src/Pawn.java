import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pawn extends Piese{
    Pawn(char x,int y){
        super(x,y);
    }
    public static void createPawns(Panel frame){
        MyHandler hnd= new MyHandler();
        for(int i=0;i<8;i++) {
            ImageIcon icon = new ImageIcon("D:/Сhess/scr/images/blackPawn.png");
            JButton but = new JButton(icon);
            but.setBounds(i*73, 70, 73, 70);
            but.addActionListener(hnd);
            frame.add(but);
        }
    }
}
class MyHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Yeea it working");
    }
}
