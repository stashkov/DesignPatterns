package Animals.Factories;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Horse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface AnimalFactory
{
    List<Animal> _ANIMALS = new ArrayList<>(
            Arrays.asList(
                    new Cat(),
                    new Dog(),
                    new Horse()
            )
    );

    Animal create();
}
