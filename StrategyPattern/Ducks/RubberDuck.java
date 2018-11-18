package Ducks;

import Ducks.QuackStrategy.NoQuackStrategy;

/**
 * This duck cannot quack, but it is a debugging expert
 */
public class RubberDuck extends Duck
{
    public RubberDuck()
    {
        _QUACK_STRATEGY = new NoQuackStrategy();
    }
}
