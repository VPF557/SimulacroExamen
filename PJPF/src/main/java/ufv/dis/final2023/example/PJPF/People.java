package ufv.dis.final2023.example.PJPF;

import com.google.gson.Gson;

import java.util.ArrayList;

public class People
{
    private String name;
    private String mass;
    private String gender;

    private ArrayList<String> films;

    public People() {
    }

    public People(String name, String mass, String gender, ArrayList<String> films) {
        this.name = name;
        this.mass = mass;
        this.gender = gender;
        this.films = films;
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

    public ArrayList<String> getFilms() {
        return films;
    }

    public void setFilm(ArrayList<String> films) {
        this.films = films;
    }

    public String MostrarJson()
    {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
