package YuriLenzi.EsSet6D2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class BlogPost {
    private int id = new Random().nextInt(1,10000);
    private String categoria;
    private String titolo;
    private String immagine;
    private String contenuto;
    private Integer tempoLettura;

    public BlogPost(String categoria, String titolo, String contenuto, int tempoLettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoLettura = tempoLettura;
        this.immagine = "https://fastly.picsum.photos/id/921/200/300";
    }

}
