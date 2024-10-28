package org.example.demodevice;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {




    @FXML
    private ToggleGroup device;

    @FXML
    private RadioButton rbLaptop;

    @FXML
    private RadioButton rbSmartphone;

    @FXML
    private RadioButton rbTablet;

    @FXML
    private TextField textName;

    @FXML
    private TextField textPrice;

    @FXML
    private TextField textWeight;


    @FXML
    private ListView<Device> listView;

    ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        listView.setItems(devices);
    }


    @FXML
    void onAddClick(ActionEvent event) {

        if(rbSmartphone.isSelected()) {
            Smartphone sm = new Smartphone();
            sm.setName(textName.getText());

            sm.setType(DeviceType.SMARTPHONE);
            sm.setPrice( Double.parseDouble(textPrice.getText()) );
            sm.setWeight( Double.parseDouble( textWeight.getText()) );

            devices.add(sm);
        }
        else if(rbLaptop.isSelected()){
            Laptop lp = new Laptop();
            lp.setName((textName.getText()));

            lp.setType(DeviceType.SMARTPHONE);
            lp.setPrice( Double.parseDouble(textPrice.getText()) );
            lp.setWeight( Double.parseDouble( textWeight.getText()) );

            devices.add(lp);
        }

        else if(rbTablet.isSelected()){
            Tablet tb = new Tablet();
            tb.setName((textName.getText()));

            tb.setType(DeviceType.SMARTPHONE);
            tb.setPrice( Double.parseDouble(textPrice.getText()) );
            tb.setWeight( Double.parseDouble( textWeight.getText()) );

            devices.add(tb);
        }

    }

    @FXML
    private Label label;

    @FXML
    protected void onListClicked(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText(devices.get(id).toString());

    }

    @FXML
    private void onRemoveClick(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText( devices.get(id).getName() + " is removed." );
        devices.remove(id);
    }

}