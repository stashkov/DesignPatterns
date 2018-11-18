package Ducks;

import Ducks.QuackStrategy.QuackStrategy;

public abstract class Duck
{
    public void setQuackStrategy( QuackStrategy quackStrategy )
    {
        _QUACK_STRATEGY = quackStrategy;
    }

    QuackStrategy _QUACK_STRATEGY;

    public void quack()
    {
        _QUACK_STRATEGY.quack();
    }
}
