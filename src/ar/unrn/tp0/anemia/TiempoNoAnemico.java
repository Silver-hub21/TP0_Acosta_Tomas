package ar.unrn.tp0.anemia;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TiempoNoAnemico {
    private LocalDateTime tiempo;

    public TiempoNoAnemico() {
        this.tiempo = LocalDateTime.now();
    }

    public void formatoLargo() {
        System.out.println(this.tiempo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    }

    public void formatoCorto() {
        System.out.println(this.tiempo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
