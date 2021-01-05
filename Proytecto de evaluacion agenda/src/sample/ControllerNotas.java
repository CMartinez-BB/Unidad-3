package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Estructura.Agenda;
import sample.Estructura.ListaNotas;

import java.util.LinkedList;
import java.util.Queue;

public class ControllerNotas {
    //Texfield
    @FXML TextField profesor, materia, telefono, dirección, tarea;

    //Tabla columnas
    TableColumn Columnanombre=new TableColumn("Profesor");
    TableColumn Columnamatera1=new TableColumn("Materia");
    TableColumn Columnaprioridad1=new TableColumn("Prioridad");
    TableColumn Columnatelefono1=new TableColumn("Telefono");
    TableColumn Columnadireccion1=new TableColumn("Dirección");
    TableColumn Columnatarea1=new TableColumn("Tarea");
    ObservableList<Agenda> listaagenda= FXCollections.observableArrayList();
    //cola para meter save data
    Queue<ListaNotas>cola=new LinkedList<>();
    //Combobox
@FXML ComboBox ComboPrioridad;

//table
    @FXML TableView table;
//Lista enlazada
    LinkedList<String> prioridad=new LinkedList<>();


    //Items del combobox-lista enlazada
@FXML protected void initialize(){
    //AÑADIR DATOS A LA TABLA
    this.Columnanombre.setCellValueFactory(new PropertyValueFactory<Agenda,String>("profesor"));
    this.Columnamatera1.setCellValueFactory(new PropertyValueFactory<Agenda,String>("materia"));
    this.Columnaprioridad1.setCellValueFactory(new PropertyValueFactory<Agenda,String>("prioridad"));
    this.Columnatelefono1.setCellValueFactory(new PropertyValueFactory<Agenda,String>("telefono"));
    this.Columnadireccion1.setCellValueFactory(new PropertyValueFactory<Agenda,String>("dirección"));
    this.Columnatarea1.setCellValueFactory(new PropertyValueFactory<Agenda,String>("tarea"));
    table.setItems(listaagenda);
    //añadir columnas
    table.getColumns().addAll(Columnanombre,Columnamatera1,Columnaprioridad1,Columnatelefono1,Columnadireccion1,Columnatarea1);
    //añadir items en combobox
    prioridad.add("Alto");
    prioridad.add("Medio");
    prioridad.add("Bajo");
    prioridad.add("Examen");
    prioridad.add("Con fecha estimada");
    //iterar la lista
    for (int x=0;x<prioridad.size();x++)ComboPrioridad.getItems().add(prioridad.get(x));
}
public void guardar(ActionEvent event){

    String cprioridad=ComboPrioridad.getSelectionModel().getSelectedItem().toString();
    String txtprofe=profesor.getText();
    String txtmateria=materia.getText();
    String txttelefono=telefono.getText();
    String txtdireccion=dirección.getText();
    String txttarea=tarea.getText();
    listaagenda.add(new Agenda(txtprofe,txtmateria,cprioridad,txttelefono,txtdireccion,txttarea));
}
public void guard(ActionEvent event){
String [][]items=new String[listaagenda.size()][6];
for (int x=0;x<items.length;x++){
    items[x][0]=listaagenda.get(x).getProfesor();
    items[x][1]=listaagenda.get(x).getMateria();
    items[x][2]=listaagenda.get(x).getPrioridad();
    items[x][3]=listaagenda.get(x).getTelefono();
    items[x][4]=listaagenda.get(x).getDirección();
    items[x][5]=listaagenda.get(x).getTarea();
}
ListaNotas nota1=new ListaNotas(items);
cola.add(nota1);
listaagenda.clear();
}
public void smile(ActionEvent event){
    Alert alert=new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Recuerda");
    alert.setContentText("Si lo puedes imagina lo puedes programar");
    alert.show();
}
}
