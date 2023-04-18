package tugaspemvis;
import java.awt.*;
import javax.swing.*;

public class Background extends JPanel{
     private Image image;
    
    public Background(){
        image = new ImageIcon(getClass().getResource("Img/Background.jpg")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(image,0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}

