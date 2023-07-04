package ufv.dis.final2023.example.PJPF;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ControllerTest {

    @org.junit.Test
    public void mandarElemento()
    {
        Controller cont = new Controller();
        DataHanding data = new DataHanding();
        Params param = new Params("people",4);
        ArrayList<String> films= new ArrayList<String>();
        films.add("https://swapi.dev/api/films/1/");
        films.add("https://swapi.dev/api/films/2/");
        films.add("https://swapi.dev/api/films/3/");
        films.add("hhttps://swapi.dev/api/films/6/");

        People people = new People("Darth Vader","136" ,"male",films);

        cont.mandarElemento(param);


    }
}