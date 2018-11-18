package Ducks;

import Ducks.QuackStrategy.StandardQuackStrategy;

/**
 * This is an ordinary duck, that quacks in an ordinary way
 */
public class OrdinaryDuck extends Duck
{

    public OrdinaryDuck()
    {
        _QUACK_STRATEGY = new StandardQuackStrategy();
    }
}
