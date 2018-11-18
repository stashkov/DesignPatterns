package Ducks.QuackStrategy;

public class NoQuackStrategy implements QuackStrategy
{
    @Override
    public void quack()
    {
        System.out.println("Cannot Quack.");
    }
}
