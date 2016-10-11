import java.applet.*;
import java.awt.*;

public class OlimpAplet extends Applet{

    private Image image;

    public void init(){

        //image = getImage(getDocumentBase(), "C:\\Users\\Ras\\IdeaProjects\\Olimpic game\\src\\img.jpg");

    }




    public void paint(Graphics g){

        setBackground(Color.lightGray);

        g.setFont(new Font("Calibri",Font.BOLD,20));
        g.drawString("XXI ОЛИМПИЙСКИЕ ИГРЫ!!!",80,50);

        g.setColor(Color.blue);
        g.drawOval(100,100,50,50);

        g.setColor(Color.black);
        g.drawOval(155,100,50,50);

        g.setColor(Color.red);
        g.drawOval(210,100,50,50);

        g.setColor(Color.yellow);
        g.drawOval(130,130,50,50);

        g.setColor(Color.green);
        g.drawOval(182,130,50,50);

        //g.drawImage(image, 0, 0, this);







    }
}
