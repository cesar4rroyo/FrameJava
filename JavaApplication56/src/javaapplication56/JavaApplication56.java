package javaapplication56;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class JavaApplication56 {


    public static void main(String[] args) {
        
        
       MarcoRaton mimarco= new MarcoRaton();
       mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
          
        
    }
    
}
    
    class MarcoRaton extends JFrame{
        public MarcoRaton(){
            setVisible(true);
            setBounds(700,300,600,450);
            
        }
    }

