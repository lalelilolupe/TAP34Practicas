package tap34practicas;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Epf {

    public static void main(String[] args) {
        //crea la ventana 
        JFrame frm = new JFrame();
        BorderLayout bl = new BorderLayout();
        frm.setLayout(bl);
        frm.setSize(300, 200);//Medidas de la ventana
        
        //Crea un botón y le indica lo que lleva escrito dentro
        JButton btn = new JButton("Cerrar");
        MiActionListener al = new MiActionListener();
        btn.addActionListener(al);
        MiMouseMotionListener op = new MiMouseMotionListener();
        btn.addMouseMotionListener(op);
        
        frm.add(btn,BorderLayout.CENTER);
        frm.setVisible(true);
    }
    
}
class MiActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    class MiMouseMotionListener implements MouseMotionListener{
        public void mouseDragged(MouseEvent e){
        
        }
        public void mouseMoved(MouseEvent e){
            int x,y;
            x = e.getX();
            y = e.getY();
            System.out.println("x: "+x+" y: "+y);
        }
    }
    
