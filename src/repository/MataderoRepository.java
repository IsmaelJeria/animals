package repository;

import domain.Animal;
import domain.Matadero;

import java.util.ArrayList;
import java.util.List;

public class MataderoRepository {

    private Matadero matadero = new Matadero();

    private static final MataderoRepository mataderoRepository = new MataderoRepository();

    private MataderoRepository() { matadero.setNombreMatadero("Matadero de don juan"); }

    public static MataderoRepository getInstance() {
        return mataderoRepository;
    }

    public Matadero getMatadero() { return matadero;  }
}
