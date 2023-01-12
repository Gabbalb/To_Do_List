package com.example.to_do_list;

import com.example.to_do_list.addons.Nota;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Collection;
import java.util.Collections;

public class ToDoListController {
    public ListView<Nota> ListaImpegni;
    public Button btnSalva;
    public TextField TxtNome;
    public DatePicker DteQuando;
    public TextArea TxtNote;
    public Button btnRiordina;

    public void onSalvabtnClick(ActionEvent actionEvent) {
        Nota temp = new Nota();
        temp.setData(" [" + DteQuando.getValue().toString() + "] ");
        temp.setNome(TxtNome.getText());
        temp.setNota(" | Note: \"" + TxtNote.getText() + "\"");
        ListaImpegni.getItems().add(0, temp);
    }

    public void onClearbtnClick(ActionEvent actionEvent) {
        ListaImpegni.getItems().clear();
    }

    public void onRiordinabtnOnclick(ActionEvent actionEvent) {
        ListView<Nota> sorted = new ListView<>();
        sorted.getItems().addAll(ListaImpegni.getItems().sorted());
        ListaImpegni.getItems().clear();
        ListaImpegni.getItems().addAll(sorted.getItems());
    }
}