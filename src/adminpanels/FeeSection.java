package adminpanels;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FeeSection extends JPanel {

	/**
	 * Create the panel.
	 */
	public FeeSection() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1076, 653);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		
		JPanel DynamicPanel = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(DynamicPanel, GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(DynamicPanel, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
					.addContainerGap())
		);
		DynamicPanel.setLayout(new CardLayout(0, 0));
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("Accept Fee Payment");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel p=new AcceptPayment();
				DynamicPanel.removeAll();
				DynamicPanel.add(p);
				DynamicPanel.revalidate();
				DynamicPanel.repaint();
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBackground(new Color(184, 134, 11));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Fee Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel p=new FeeDetails();
				DynamicPanel.removeAll();
				DynamicPanel.add(p);
				DynamicPanel.revalidate();
				DynamicPanel.repaint();
			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1.setBackground(new Color(240, 128, 128));
		panel_1.add(btnNewButton_1);
		panel.setLayout(gl_panel);
		

	}
}
