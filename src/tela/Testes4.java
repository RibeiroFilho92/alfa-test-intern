package tela;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import aplicacao.MainClass;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import objetos.Caminhao;
import objetos.Movimento;
import objetos.Registro;
import objetos.Unidade;

public class Testes4 implements Initializable{
	
	@FXML
	private TableView<Registro> tbRegistrosDep2;
	@FXML
	private TableColumn<Registro, Enum> colMovimento;
	@FXML
	private TableColumn<Registro, String> colCaminhao;
	@FXML
	private TableColumn<Registro, String> colPlaca;
	@FXML
	private TableColumn<Registro, String> colOdometro;
	@FXML
	private TableColumn<Registro, String> colMotorista;
	@FXML
	private TableColumn<Registro, String> colOrigem;
	@FXML
	private TableColumn<Registro, String> colLacres;
	@FXML
	private TableColumn<Registro, String> colUsuario;
	@FXML
	private TableColumn<Registro, String> colData;
	
	private List<Registro> listRegistrosDep2 = new ArrayList<>();
	private ObservableList<Registro> observableListRegistrosDep2;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		getRegistros();
		
	}
	
	@FXML
	public void btVoltatela() {
		MainClass.changeScreen("dep1");
	};
	
	public void getRegistros() {
		
		Unidade mat = new Unidade("MAT", "José");
		Unidade dep1 = new Unidade("DEP1", "João");
		Unidade dep2 = new Unidade("DEP2", "Luis");
		
		Caminhao c1 = new Caminhao("C1", "AKB-154", 1000);
		Caminhao c2 = new Caminhao("C2", "ADR-842", 1110);
		Caminhao c3 = new Caminhao("C3", "VGY-741", 500);
		Caminhao c4 = new Caminhao("C4", "THY-963", 420);
		Caminhao c5 = new Caminhao("C5", "APO-756", 870);
		
		Registro r1 = new Registro(c1, mat, "10-05-2021 08:00", Movimento.SAIDA, "15/27/32");
		c1.setNomeMotorista("João");
		
		Registro r2 = new Registro(c1, dep1, "10-05-2021 10:00", Movimento.ENTRADA, "15/27/32");
		c1.addOdometro(50);;
		
		Registro r3 = new Registro(c2, dep1, "10-05-2021 09:00", Movimento.SAIDA, "88/38/21");
		c2.setNomeMotorista("Luis");
		
		Registro r4 = new Registro(c2, dep2, "10-05-2021 11:00", Movimento.ENTRADA, "88/38/21");
		c2.addOdometro(40);
		listRegistrosDep2.add(r4);
		
		Registro r5 = new Registro(c3, mat, "10-05-2021 09:30", Movimento.SAIDA, "08/18/27");
		c3.setNomeMotorista("Flavio");
		
		Registro r6 = new Registro(c3, dep1, "10-05-2021 10:30", Movimento.ENTRADA, "08/18/27");
		c3.addOdometro(70);

		
		Registro r7 = new Registro(c4, dep2, "10-05-2021 07:55", Movimento.SAIDA, "77/98/07");
		c4.setNomeMotorista("Rogerinho");
		listRegistrosDep2.add(r7);
		
		Registro r8 = new Registro(c4, mat, "10-05-2021 9:42", Movimento.ENTRADA, "77/98/07");
		c4.addOdometro(55);
		
		Registro r9 = new Registro(c5, dep2, "10-05-2021 07:58", Movimento.SAIDA, "19/37/22");
		c5.setNomeMotorista("Julinho");
		listRegistrosDep2.add(r9);
		
		Registro r10 = new Registro(c5, mat, "10-05-2021 09:44", Movimento.ENTRADA, "19/37/22");
		c5.addOdometro(42);
		
		Registro r11 = new Registro(c5, mat, "10-05-2021 10:11", Movimento.SAIDA, "");;
		
		Registro r12 = new Registro(c5, dep1, "10-05-2021 11:59", Movimento.ENTRADA, "");
		
		Registro r13 = new Registro(c4, mat, "10-05-2021 10:08", Movimento.SAIDA, "");
		
		Registro r14 = new Registro(c4, dep2, "10-05-2021 12:11", Movimento.ENTRADA, "");
		listRegistrosDep2.add(r14);
		
		colMovimento.setCellValueFactory(new PropertyValueFactory<>("movimento"));
		colCaminhao.setCellValueFactory(obj -> new SimpleStringProperty(obj.getValue().getCam().getNome()));
		colPlaca.setCellValueFactory(obj -> new SimpleStringProperty(obj.getValue().getCam().getPlaca()));
		colOdometro.setCellValueFactory(obj -> new SimpleStringProperty(obj.getValue().getCam().getOdometro().toString()));
		colMotorista.setCellValueFactory(obj -> new SimpleStringProperty(obj.getValue().getCam().getNomeMotorista()));
		colOrigem.setCellValueFactory(obj -> new SimpleStringProperty(obj.getValue().getUnd().getNome()));
		colLacres.setCellValueFactory(new PropertyValueFactory<>("lacres"));
		colUsuario.setCellValueFactory(obj -> new SimpleStringProperty(obj.getValue().getUnd().getFiscal()));
		colData.setCellValueFactory(new PropertyValueFactory<>("data"));
		
		observableListRegistrosDep2 =  FXCollections.observableArrayList(listRegistrosDep2);
		tbRegistrosDep2.setItems(observableListRegistrosDep2);
		
	}

}
