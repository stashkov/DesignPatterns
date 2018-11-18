import Animals.Animal;
import Animals.Factories.AnimalFactory;
import Animals.Factories.RandomAnimalFactory;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethodPatternMain
{
    public static void main( String[] args )
    {
        List<Animal> zoo = new ArrayList<>();

        AnimalFactory randomAnimalFactory = new RandomAnimalFactory();
        zoo.add( randomAnimalFactory.create() );
        zoo.add( randomAnimalFactory.create() );
        zoo.add( randomAnimalFactory.create() );

        System.out.println(zoo);

    }
}
