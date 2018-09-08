/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.window_programming.swingcomponentboundssample;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lendle
 */
public class SetBounds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(800, 600);
        JLabel label = new JLabel("帳號");
        JTextField textField = new JTextField();
        label.setBounds(50, 50, 100, 30);
        textField.setBounds(160, 50, 200, 30);
        frame.add(label);
        frame.add(textField);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        frame.setVisible(true);
    }

}
