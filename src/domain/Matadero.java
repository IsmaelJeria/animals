package domain;
import java.util.ArrayList;
import java.util.List;

public class Matadero {

    private String id;

    List<Animal> animalList = new ArrayList<>();

    private String nombreMatadero;

    public Matadero(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public String getNombreMatadero() {
        return nombreMatadero;
    }

    public void setNombreMatadero(String nombreMatadero) {
        this.nombreMatadero = nombreMatadero;
    }

}
