package pm.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import pm.controller.GUIController;

/**
 * 
 * @author bech2002
 * @version 1.3 added Layout manager
 */
public class GUIPanel extends JPanel
{

		private GUIController baseController;
		private JButton firstButton;
		private JButton secondButton;
		private SpringLayout baseLayout;
		
		public GUIPanel(GUIController baseController)
		{
			this.baseController = baseController;
			
			baseLayout = new SpringLayout();
			firstButton = new JButton("My first button =D");
			secondButton = new JButton("Look, I made another button!!!");
			

			
			setupPanel();
			setupLayout();
		}
		
		private void setupPanel()
		{
			this.setBackground(Color.GREEN);
			this.setLayout(baseLayout);
			this.add(firstButton);
			this.add(secondButton);
		}
		
		private void setupLayout()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 39, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, firstButton, 74, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 22, SpringLayout.SOUTH, firstButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, secondButton, 89, SpringLayout.SOUTH, firstButton);
			baseLayout.putConstraint(SpringLayout.WEST, secondButton, 74, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, secondButton, 307, SpringLayout.WEST, this);
		}
}
