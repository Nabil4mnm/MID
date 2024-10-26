package cse213.midautumn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Material;

import java.util.ArrayList;

public class MidAutumn
{
    @FXML
    private ComboBox<Integer> QuantityComboBox;
    @FXML
    private DatePicker DeliveryDatePicker;
    @FXML
    private TextField ProductIDTextField;
    @FXML
    private TableColumn<Product, Integer> ProductIDColumn;
    @FXML
    private TableColumn<Product, Integer> QuantityColumn;
    @FXML
    private TableColumn<Product, String> MaterialColumn;
    @FXML
    private TableView<Product> ProductTableView;
    @FXML
    private TableColumn<Product, String > ProductNameColumn;
    @FXML
    private ComboBox<String > MaterialComboBox;
    @FXML
    private TextField ProductNameTextField;

    private ArrayList<Product> products = new ArrayList<>();

    @FXML
    public void initialize() {
        MaterialComboBox.getItems().addAll("Wood", "Metal", "Board", "Cloth", "Other");
        QuantityComboBox.getItems().addAll(1,2,3,4,5);
        ProductNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        MaterialColumn.setCellValueFactory(new PropertyValueFactory<>("material"));
        ProductIDColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        QuantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));





    }

    @FXML
    public void AddProductButton(ActionEvent actionEvent) {
    String name = ProductNameTextField.getText();
    String material = MaterialComboBox.getSelectionModel().getSelectedItem();
    int quantity = QuantityComboBox.getValue();
    int id = Integer.parseInt(ProductIDTextField.getText());
    Product product = new Product(name, material, quantity, id);
    products.add(product);
    ProductTableView.getItems().add(product);









    }
}