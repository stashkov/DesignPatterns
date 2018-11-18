package Ducks.QuackStrategy;

public class StandardQuackStrategy implements QuackStrategy
{
    @Override
    public void quack()
    {
        System.out.println("Quacking in a standard manner.");
    }
}
