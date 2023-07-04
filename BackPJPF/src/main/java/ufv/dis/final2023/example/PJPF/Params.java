package ufv.dis.final2023.example.PJPF;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class Params
{
    @JsonProperty
    private String entity;
    @JsonProperty
    private int id;

    public Params() {
    }

    public Params(String entity, int id) {
        this.entity = entity;
        this.id = id;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String MostrarJson()
    {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
