package Clases;

public class Navegador {
    public paginaNombres index;
    public paginaTableroConfig info;
    public Navegador() {
        info = new paginaTableroConfig(this);
        index = new paginaNombres(this);
    }
}
