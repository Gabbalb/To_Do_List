package com.example.to_do_list.addons;

public class Nota {
    private String Nome;
    private String Data;
    private String Nota;

    public Nota() {
        Nome = "";
        Data = "";
        Nota = "";
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setData(String data) {
        Data = data;
    }

    public void setNota(String nota) {
        Nota = nota;
    }

    public String getNome() {
        return Nome;
    }

    public String getData() {
        return Data;
    }

    public String getNota() {
        return Nota;
    }

    @Override
    public String toString() {
        return  Data + Nome + Nota;
    }
}
