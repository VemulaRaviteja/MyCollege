package testMycollege;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrametest extends JFrame {

	//private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrametest frame = new JFrametest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrametest() {
        //setPreferredSize(new Dimension(420, 90));
        setBounds(50,50,1400,700);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
                // creating JButton in the main JPanel (white)
                
                getContentPane().setLayout(null);
               
                        
                        JPanel panel_2 = new JPanel();
                        panel_2.setBounds(0, 0, 1163, 661);
                        getContentPane().add(panel_2);
                         panel_2.setLayout(new CardLayout(0, 0));
                                
                                
                         
                        
                                JPanel panel_1 = new JPanel();
                                panel_2.add(panel_1, "name_515251312063239");
                               
                                JPanelOne panel=new JPanelOne();
                                panel_2.add(panel, "name_515251302852883");
                                
                                
                                JButton testButton = new JButton("Button from main class");
                                testButton.setBounds(1213, 65, 137, 21);
                                testButton.addActionListener(new ActionListener() {
                                	public void actionPerformed(ActionEvent e) {
                                		panel.setVisible(false);
                                		panel_1.setVisible(true);
                                	}
                                });
                                
                                JButton btnOtherClassPanel = new JButton("other class panel ");
                                btnOtherClassPanel.setBounds(1237, 132, 113, 21);
                                btnOtherClassPanel.addActionListener(new ActionListener() {
                                	public void actionPerformed(ActionEvent e) {
                                		panel_1.setVisible(false);
                                		panel.setVisible(true);
                                	}
                                });  
                                
                              getContentPane().add(testButton);
                              getContentPane().add(btnOtherClassPanel);

        //pack();

}
	}


