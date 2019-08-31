package javaapplication56;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class JavaApplication56 {


    public static void main(String[] args) {
        
        
       MarcoConTeclas mimarco= new MarcoConTeclas();
       mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
          
        
    }
    
}
    
    class MarcoConTeclas extends JFrame{
        public MarcoConTeclas(){
            setVisible(true);
            setBounds(700,300,600,450);
            
        }
    }

