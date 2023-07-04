package org.vaadin.example;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.net.URISyntaxException;
import java.util.ArrayList;

public class VistaListado extends VerticalLayout {
    ArrayList<Param> listaParametro = new ArrayList<>();
    public VistaListado()
    {

    }
    public void mostrar()
    {
        removeAll();
        HorizontalLayout horizontal= new HorizontalLayout();
        ArrayList<Params> listaParams = new ArrayList<>();
        ArrayList<Params> listaAux = new ArrayList<>();

        Grid<Params> grid = new Grid<>(Params.class, false);
        grid.addColumn(Params::getEntity).setHeader("Entity ");
        grid.addColumn(Params::getId).setHeader("ID");


        GridContextMenu<Params> menu = grid.addContextMenu();
        menu.setOpenOnClick(true);
        menu.addItem("Delete", event ->
        {
            grid.setItems(DataService.eliminarParam(event.getItem().get(),listaAux));
        });
        grid.setAllRowsVisible(true);
        this.add(grid);
        add(horizontal);

       try {
           listaParams = DataService.getProductos(listaParams);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        grid.setItems(listaParams);


        this.add(horizontal,grid);
    }

}