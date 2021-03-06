package repository;

import com.sun.xml.internal.fastinfoset.algorithm.UUIDEncodingAlgorithm;
import domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AnimalRepository {

    private List<Animal> animalList = new ArrayList<>();

    private static final AnimalRepository animalRepository = new AnimalRepository();

    private AnimalRepository() {
        animalList.addAll(crearOvejas());
        animalList.addAll(crearVacas());
        animalList.addAll(crearCabras());
        animalList.addAll(crearCerdos());
        System.out.println("Se han creado un conjunto de animales en el banco de datos 'AnimalRepository'");
    }

    public static AnimalRepository getInstance() {
        return animalRepository;
    }

    private List<Oveja> crearOvejas() {
        Oveja oveja1 = new Oveja();
        oveja1.setId(UUID.randomUUID().toString());
        oveja1.setPeso(30.5D);

        Oveja oveja2 = new Oveja();

        oveja2.setId(UUID.randomUUID().toString());
        oveja2.setPeso(26.4D);

        List<Oveja> ovejaList = new ArrayList<>();

        ovejaList.add(oveja1);
        ovejaList.add(oveja2);

        return ovejaList;

    }

    private List<Vaca> crearVacas() {
        Vaca vaca1 = new Vaca();
        vaca1.setId(UUID.randomUUID().toString());
        vaca1.setPeso(100.5D);

        Vaca vaca2 = new Vaca();

        vaca1.setId(UUID.randomUUID().toString());
        vaca1.setPeso(140.4D);

        List<Vaca> vacaList = new ArrayList<>();

        vacaList.add(vaca1);
        vacaList.add(vaca2);

        return vacaList;
    }

    private List<Cabra> crearCabras() {
        Cabra cabra = new Cabra();
        cabra.setId(UUID.randomUUID().toString());
        cabra.setPeso(49.1D);

        List<Cabra> cabraList = new ArrayList<>();

        cabraList.add(cabra);
        return cabraList;
    }

    private List<Cerdo> crearCerdos() {
        Cerdo cerdo1 = new Cerdo();
        cerdo1.setId(UUID.randomUUID().toString());
        cerdo1.setPeso(101.5D);

        Cerdo cerdo2 = new Cerdo();

        cerdo2.setId(UUID.randomUUID().toString());
        cerdo2.setPeso(141.4D);

        List<Cerdo> cerdoList = new ArrayList<>();

        cerdoList.add(cerdo1);
        cerdoList.add(cerdo2);

        return cerdoList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

}
