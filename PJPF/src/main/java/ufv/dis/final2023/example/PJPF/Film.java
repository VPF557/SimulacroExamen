package ufv.dis.final2023.example.PJPF;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Film
{
    ArrayList<String> films;

    public Film() {
    }

    public Film(ArrayList<String> films) {
        this.films = films;
    }

    public ArrayList<String> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<String> films) {
        this.films = films;
    }

    public String MostrarJson()
    {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
