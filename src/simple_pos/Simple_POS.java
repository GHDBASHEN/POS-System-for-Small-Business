/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_pos;


import javax.swing.*;

public class Simple_POS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> {
            NewJFrame form = new NewJFrame();
            form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            form.setSize(800, 600); // Set your desired size
            form.setVisible(true);
            });
        // TODO code application logic here
    }
    
}
