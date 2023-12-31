package ufv.dis.final2023.example.PJPF;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class DataHanding {

    private final static String url = "https://swapi.dev/api/%s/%s";
    //Peticiones 
    public People obtenerPeople(Params params)
    {

        People people = null;

        String peopleUrl = String.format(url, params.getEntity(), params.getId());

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(peopleUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient
                    .newBuilder()
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String jsonData = response.body();

            Gson gson = new Gson();
            people = gson.fromJson(jsonData, People.class);

        } catch (URISyntaxException e) {
            System.out.println("Error al crear la request: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        return people;
    }

    public Starship obtenerStarships(Params params)
    {

        Starship starship = null;

        String peopleUrl = String.format(url, params.getEntity(), params.getId());

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(peopleUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient
                    .newBuilder()
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String jsonData = response.body();

            Gson gson = new Gson();
            starship = gson.fromJson(jsonData, Starship.class);

        } catch (URISyntaxException e) {
            System.out.println("Error al crear la request: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        return starship;
    }

    public ArrayList<Params> buscarObjeto(String param1,int param2, String ruta) {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        ArrayList<Params> listaAux = reader.LeerFicheroPeticiones(ruta);
        for (int i = 0; i < listaAux.size(); i++) {
            if (listaAux.get(i).getEntity().equals(param1) && listaAux.get(i).getId() == param2)
            {
                listaAux.remove(i);
            }
        }
        return listaAux;
    }

    public int  buscarPeople(People people, String ruta) {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        int control = 0;
        ArrayList<People> listaAux = reader.LeerFicheroPeople(ruta);
        for (int i = 0; i < listaAux.size(); i++)
        {
            if (listaAux.get(i).getName().equals(people.getName()) &&
                    listaAux.get(i).getMass().equals(people.getMass() )
                    && listaAux.get(i).getGender().equals(people.getGender()))
            {
               control = 4;
            }
        }
        return control;
    }

    public int  contarElementos(People people, String ruta) {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        int control = 0;
        ArrayList<People> listaAux = reader.LeerFicheroPeople(ruta);
        for (int i = 0; i < listaAux.size(); i++)
        {
            if (listaAux.get(i).getName().equals(people.getName()) &&
                    listaAux.get(i).getMass().equals(people.getMass() )
                    && listaAux.get(i).getGender().equals(people.getGender()))
            {
                control = 4;
            }
        }
        return control;
    }

}
