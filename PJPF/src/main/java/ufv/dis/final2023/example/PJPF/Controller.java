package ufv.dis.final2023.example.PJPF;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    LeerJson reader = new LeerJson();
    DataHanding data = new DataHanding();
    EscribirJson writter = new EscribirJson();

   /* @GetMapping("/registro")
    public ArrayList<Params> listaObjeto1()
    {
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Params> listaPeticiones = reader.LeerFicheroPeticiones("Petitions.json");
        //Mostramos los elementos leidos
        return listaPeticiones;
    }

    @GetMapping("/registroP")
    public ArrayList<Planet> listaPlanets()
    {
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Planet> listaPlanets = reader.LeerFicheroPlanets("Planets.json");
        //Mostramos los elementos leidos
        return listaPlanets;
    } */

    @PostMapping("/peticion")
    public void mandarElemento(@RequestBody Params objeto1)
    {
        //Hecho
        ArrayList<People> listaPlanets = reader.LeerFicheroPeople("peoples.json");
        ArrayList<Params> listaPeticiones = reader.LeerFicheroPeticiones("petitions.json");
        ArrayList<Starship> listaStarships = reader.LeerFicheroStarships("starships.json");

        if(objeto1.getEntity().equals("starships"))
        {
            Starship starship = new Starship();
            starship = data.obtenerStarships(objeto1);
            listaStarships.add(starship);
            writter.escribirJsonStarship(listaStarships);

        }
        else
        {
            People people = new People();
            people = data.obtenerPeople(objeto1);
            listaPlanets.add(people);
            writter.escribirJsonPeople(listaPlanets);

        }

        listaPeticiones.add(objeto1);
        writter.escribirJsonPeticiones(listaPeticiones);
    }

  /*  @DeleteMapping("/Borrar{parameter1}{parameter2}")
    public ArrayList<Param> borrarParam(@RequestParam String parameter1,@RequestParam int parameter2 )
    {
        ArrayList<Param>  lista = data.buscarObjeto(parameter1,parameter2,"Petitions.json");
        EscribirJson escribirJSON = new EscribirJson();
        writter.escribirJsonPeticiones(lista);

        return lista;

    }*/
}
