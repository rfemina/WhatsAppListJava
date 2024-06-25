package com.projetosrafaelfemina.whatsapplist.Model;

public class User {

    private int photo;
    private String name;
    private String message;

    public User(int foto, String nome, String mensagem) {
        this.photo = foto;
        this.name = nome;
        this.message = mensagem;
    }

    public int getFoto() {
        return photo;
    }

    public void setFoto(int foto) {
        this.photo = foto;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getMensagem() {
        return message;
    }

    public void setMensagem(String mensagem) {
        this.message = mensagem;
    }
}
