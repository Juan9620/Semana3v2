package com.MatiCabrera.petagram;

class Mascotas {
    String nombre;
    String rating;
    int imageFoto;

    Mascotas(String nombre, String rating, int imgFoto) {
        this.nombre = nombre;
        this.rating = rating;
        this.imageFoto = imgFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getImageFoto() {
        return imageFoto;
    }

    public void setImageFoto(int imageFoto) {
        this.imageFoto = imageFoto;
    }
}