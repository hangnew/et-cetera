package ppt연습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 연습 {

	public static void main(String[] args) {
		
		Random r = new Random();
		JFrame f = new JFrame("누가 갈까?");
		f.setSize(200, 100);
		f.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("누가 갈까?");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = r.nextInt(3);
				switch (result) {
				case 0 :
					JOptionPane.showMessageDialog(f, "윤이가 다녀오기");
					break;
				case 1 :
					JOptionPane.showMessageDialog(f, "뚜리가 다녀오기");
					break;
				default :
					JOptionPane.showMessageDialog(f, "같이 다녀오기");
					break;
				}
				
			}
		});
		b1.setBounds(35, 24, 117, 29);
		f.getContentPane().add(b1);
		f.setVisible(true);
	}
}
