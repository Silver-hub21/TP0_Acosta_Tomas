package ar.unrn.tp0.anemia;


import java.time.LocalDateTime;

public class TiempoAnemico {
    private LocalDateTime tiempo;

    public TiempoAnemico() { //constructor
        this.tiempo = LocalDateTime.now();
    }

    public void setTiempo(LocalDateTime tiempo) {
        this.tiempo = tiempo;
    }

    public LocalDateTime getTiempo() {
        return tiempo;
    }
}
