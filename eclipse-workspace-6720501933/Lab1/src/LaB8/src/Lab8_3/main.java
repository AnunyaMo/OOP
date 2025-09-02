package Lab8_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class main {
	public static void main(String[] args){
		 JFrame frame = new JFrame("Test");
		 frame.setSize(250,300);
		 frame.setVisible(true);
		 frame.setEnabled (true);
		 JButton jb = new JButton("click");
		 JPanel center = new JPanel();
		 center.add(jb);
		 frame.getContentPane().add(center, BorderLayout.CENTER);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 jb.addActionListener(new ActionListener() {
				 int count=0;
				 
				 @Override
				 public void actionPerformed(ActionEvent e) {
					 count++;
					 JButton btn = (JButton)e.getSource();
					 btn.setText("count:"+count);
				 }
				 
		 });
		}
		

}
