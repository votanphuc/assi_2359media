package main.java.com.media2359.assigment;


import main.java.com.media2359.assigment.animal.Animal;

import java.util.List;

//@Controller
//@RequestMapping("/animal")
public class AnimalController {

    //GET "/"
    public List<Animal> getAnimals() {
        return null;
    }

    //POST "/"
    public boolean addAnimal(Animal animal) {
        return true;
    }

    //PUT "/"
    public boolean updateAParamOfnimal(long animalId, Object... params) {
        return true;
    }

    //DELETE "/"
    public boolean deleteAnimal(long animalId) {
        return true;
    }

}
