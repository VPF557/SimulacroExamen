package ufv.dis.final2023.example.PJPF;

import com.google.gson.Gson;

import java.util.ArrayList;

public class People
{
    private String name;
    private String mass;
    private String gender;

    private ArrayList<Film> film;

    public People() {
    }

    public People(String name, String mass, String gender, ArrayList<Film> film) {
        this.name = name;
        this.mass = mass;
        this.gender = gender;
        this.film = film;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<Film> getFilm() {
        return film;
    }

    public void setFilm(ArrayList<Film> film) {
        this.film = film;
    }

    public String MostrarJson()
    {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
