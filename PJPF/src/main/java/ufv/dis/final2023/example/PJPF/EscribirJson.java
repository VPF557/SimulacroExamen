package ufv.dis.final2023.example.PJPF;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscribirJson {
    static void escribirJsonPeople(ArrayList<People> listaPeople)
    {

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("peoples.json")) {
            gson.toJson(listaPeople, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void escribirJsonPeticiones(ArrayList<Params> listaParams)
    {
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("petitions.json")) {
            gson.toJson(listaParams, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void escribirJsonStarship(ArrayList<Starship> listaStarship)
    {

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("starships.json")) {
            gson.toJson(listaStarship, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
