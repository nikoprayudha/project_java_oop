package interfaace.guievendhandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Form extends JFrame implements ActionListener {
    public JLabel label1,label2,label3;
    public JTextField tf1,tf2;
    public JButton btn1,btn2;
    public JPanel panel;
    
    public void buatKomp(){
        label1 = new JLabel("Panjang = ");
        label2 = new JLabel("Lebar = ");
        label3 = new JLabel("Hasil = ...... ");
        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        btn1 = new JButton("Luas");
        btn2 = new JButton("Keliling");
        panel = new JPanel();
        panel.add(label1);
        panel.add(tf1);
        panel.add(label2);
        panel.add(tf2);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(label3);
        add(panel);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        float p = Float.parseFloat(tf1.getText());
        float l = Float.parseFloat(tf2.getText());
            SegiEmpat se = new SegiEmpat(p,l);
            float hasil = 0;
            if(ae.getSource().equals(btn1)){
                 hasil = se.hitungLuas();
            }else{
                hasil = se.hitungKeliling();
            }
            label3.setText("Hasil = "+hasil);
    }
  
    public static void main(String[]args){
        Form f = new Form();
        f.setTitle("Segi Empat");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500 ,200);
        f.buatKomp();
        f.setVisible(true);
    }
}
    

