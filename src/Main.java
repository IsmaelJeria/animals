import domain.Animal;
import repository.AnimalRepository;
import repository.CampoRepository;
import repository.EstabloRepository;
import repository.MataderoRepository;
import service.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();

        System.out.println("paso0");


        IRecoleccionAnimales animales = new AnimalService(AnimalRepository.getInstance());
        IRecoleccionAnimales campo = new CampoService(CampoRepository.getInstance());
        IRecoleccionAnimales establo = new EstabloService(EstabloRepository.getInstance());
        IRecoleccionAnimales matadero = new MataderoService(MataderoRepository.getInstance());


//        System.out.println("paso1");

        animalList = animales.recogerAnimales();

//        System.out.println("paso2");


        campo.agregarAnimales(animalList);

//        System.out.println("paso3");


        animalList = campo.recogerAnimales();

//        System.out.println("paso4");


        establo.agregarAnimales(animalList);

//        System.out.println("paso5");


        animalList = establo.recogerAnimales();

        matadero.agregarAnimales(animalList);


    }

}
