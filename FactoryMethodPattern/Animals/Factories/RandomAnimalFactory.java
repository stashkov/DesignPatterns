package Animals.Factories;

import Animals.Animal;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory
{
    @Override
    public Animal create()
    {
        return _ANIMALS.get( new Random().nextInt( _ANIMALS.size() ) );
    }
}
