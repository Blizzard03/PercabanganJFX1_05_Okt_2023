/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package percabanganjfx1.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import percabanganjfx1.Model.*;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

/**
 *
 * @author Muhamad Ariq Rasyid
 */
public class PercabanganJFX1Controller implements Initializable {

    PercabanganJFX1model dt = new PercabanganJFX1model();

    @FXML
    private TextField txtjumlah;
    @FXML
    private TextField txtbayar;
    @FXML
    private CheckBox chkwarna;
    @FXML
    private ToggleButton tgbjilid;
    @FXML
    private RadioButton rdbpelajar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void hitungklik(ActionEvent event) {
        {
            int harga = 200;
            int biaya = 0;
            dt.setJumlah(Integer.parseInt(txtjumlah.getText()));
            dt.setWarna(chkwarna.isSelected());
            dt.setJilid(tgbjilid.isSelected());
            dt.setPelajar(rdbpelajar.isSelected());
            if (dt.isWarna()) {
                harga += 100;
            }
            if (dt.isJilid()) {
                biaya = 10000;
            }
            if (dt.isPelajar()) {
                harga -= 50;
            }
            int bayar = harga * dt.getJumlah() + biaya;
            txtbayar.setText(String.valueOf(bayar));
        }
    }

    @FXML
    private void keluarkllik(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void hapusklik(ActionEvent event) {
        txtbayar.setText("");
        txtjumlah.setText("");
        chkwarna.setSelected(false);
        rdbpelajar.setSelected(false);
        tgbjilid.setSelected(false);
    }

}
