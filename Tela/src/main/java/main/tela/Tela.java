

package main.tela;

import java.awt.Dimension;
import java.awt.Toolkit;


public class Tela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        
        System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);
        
        
      
      
    }
}
