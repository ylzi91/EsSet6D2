package YuriLenzi.EsSet6D2.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super(id + " non trovato");
    }
}
