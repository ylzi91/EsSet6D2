package YuriLenzi.EsSet6D2.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class NuovoAutorePayload {
    private String nome, cognome, email;
    private String dataNascita;

}
