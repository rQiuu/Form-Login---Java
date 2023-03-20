/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author Rizqi Ananta / 123210023
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Logout extends JFrame implements ActionListener{
    
    private JFrame TelahLogin ;
    private JLabel lbl1 ;
    private JButton btn1,btn2;

    public Logout(){
    
        TelahLogin = new JFrame();
        setTitle("Login Berhasil");
        setSize(300, 150);//atur ukuran
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//frame ditengah
        setLayout(null);//tampilkan frame
        
        lbl1 = new JLabel("Silahkan Logout");//membuat label
        lbl1.setBounds(90, 25, 100, 30);
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        
        btn1 = new JButton("Logout");
        btn1.setBounds(90, 50, 100, 30);
        btn1.setHorizontalAlignment(SwingConstants.CENTER);
        
        btn2 = new JButton("EXIT");
        btn2.setBounds(105, 80, 70, 30);
        btn2.setHorizontalAlignment(SwingConstants.CENTER);
        
        add(lbl1);
        add(btn1) ;
        add(btn2) ;
        setVisible(true);
        btn1.addActionListener(this);  
        btn2.addActionListener(this); 
    }

    public void actionPerformed(ActionEvent e) {  
        if( e.getSource() == btn1 ){
            JOptionPane.showMessageDialog(null, "Logout berhasil");
            new TugasLogin().setVisible(true);
            dispose() ;
        }else if (e.getSource() == btn2 ){
            JOptionPane.showMessageDialog(null, "EXIT berhasil");
            System.exit(0);
        }
    }
}
