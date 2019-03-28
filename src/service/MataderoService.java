package service;
import domain.Animal;
import repository.MataderoRepository;

import java.util.ArrayList;
import java.util.List;


public class MataderoService implements IRecoleccionAnimales{

    private final MataderoRepository mataderoRepository;

    public MataderoService(MataderoRepository mataderoRepository){this.mataderoRepository = mataderoRepository; }


    @Override
    public List<Animal> recogerAnimales() {
        List<Animal> animalList = new ArrayList<>();
        animalList.addAll(mataderoRepository.getMatadero().getAnimalList());
        mataderoRepository.getMatadero().getAnimalList().removeAll(mataderoRepository.getMatadero().getAnimalList());
        System.out.println("Has recogido una lista de animales del banco de datos 'MataderoRepository'");
        return animalList;
    }

    @Override
    public void agregarAnimales(List<Animal> animalList) {
        mataderoRepository.getMatadero().getAnimalList().addAll(animalList);
        System.out.println("Has agregado animales al banco de datos 'MataderoRepository'. Ahora estos animales van a emitir un sonido pq seran faenados");
        animalList.forEach(item -> {
            item.emitirSonido();
        });
    }
}
