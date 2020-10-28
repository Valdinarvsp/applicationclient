package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemCliente;
	
	@FXML
	private MenuItem menuItemDependente;
	
	@FXML
	private MenuItem menuItemConvenio;
	
	@FXML
	private MenuItem menuItemContrato;
	
	@FXML
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemClienteAction() {
		System.out.println("menuItemCliente");
	}
	
	@FXML
	public void onMenuItemDependenteAction() {
		System.out.println("menuItemDependente");
	}
	
	@FXML
	public void onMenuItemConvenioAction() {
		System.out.println("menuItemConvenio");
	}
	
	@FXML
	public void onMenuItemContratoAction() {
		System.out.println("menuItemContrato");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("menuItemSobre");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}

}
