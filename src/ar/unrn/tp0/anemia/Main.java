package ar.unrn.tp0.anemia;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        var tiempoAnemico = new TiempoAnemico();
        var tiempoNoAnemico = new TiempoNoAnemico();

        //forma anémica
        System.out.println(tiempoAnemico.getTiempo().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(tiempoAnemico.getTiempo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        //forma no anémica
        tiempoNoAnemico.formatoCorto();
        tiempoNoAnemico.formatoLargo();

    }
}