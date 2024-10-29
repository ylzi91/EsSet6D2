package YuriLenzi.EsSet6D2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Random;


@Getter
@Setter
@ToString
public class Autore {
    private static int id = new Random().nextInt(1,1000);
    private String nome, cognome, email, avatar;
    private LocalDate dataNascita;

    public Autore(String nome, String cognome, String email, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.avatar = "https://ui-avatars.com/api/?name=" + nome + "+" + cognome;
        this.dataNascita = dataNascita;
    }
}
