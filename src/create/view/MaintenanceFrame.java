package create.view;

import create.controller.*;
import javax.swing.*;

public class MaintenanceFrame extends JFrame
{

	private MaintenanceController appController;
	private MaintenancePanel appPanel;
	
	public MaintenanceFrame(MaintenanceController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new MaintenancePanel();
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("HandymanFindr");
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
}
