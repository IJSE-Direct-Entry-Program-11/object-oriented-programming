package lk.ijse.dep11.demo11.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class OrderSceneController {
    public TextField txtCode;
    public TextField txtDescription;
    public TextField txtStock;
    public TextField txtBuyingPrice;
    public TextField txtSellingPrice;
    public Spinner<Integer> txtQty;
    public Button btnAdd;
    public TableView tblCart;
    public Button btnNewOrder;
    public Label lblTotal;
    public Label lblProfit;

    ArrayList<Item> itemList = new ArrayList<>();

    public void initialize(){
        Item item1 = new Item("4792210125234",
                "Atlas Whiteboard Marker Blue Pen",
                10, 150, 170);

        Item item2 = new Item("4792210112753",
                "Atlas Whiteboard Marker Black Pen",
                20, 160, 180);

        itemList.add(item1);
        itemList.add(item2);

        btnAdd.setDisable(true);
        btnAdd.setDefaultButton(true);
        txtQty.setEditable(true);
        txtQty.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1, 1));
    }

    public void txtCodeOnAction(ActionEvent actionEvent) {
        String inputCode = txtCode.getText().strip();
        for (Item item : itemList) {
            if (item.barCode.equals(inputCode)){
                txtDescription.setText(item.description);
                txtStock.setText(item.stock + "");
                txtBuyingPrice.setText(item.buyingPrice + "");
                txtSellingPrice.setText(item.sellingPrice + "");
                txtQty.requestFocus();
                return;
            }
        }
        new Alert(Alert.AlertType.ERROR, "Item does not exist").show();
        txtCode.selectAll();
    }

    public void btnAddOnAction(ActionEvent actionEvent) {
    }

    public void btnNewOrderOnAction(ActionEvent actionEvent) {
    }
}

class Item {
    String barCode;
    String description;
    int stock;
    double buyingPrice;
    double sellingPrice;

    public Item(String barCode, String description, int stock, double buyingPrice, double sellingPrice) {
        this.barCode = barCode;
        this.description = description;
        this.stock = stock;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    double getProfit(){
        return (sellingPrice - buyingPrice);
    }
}
