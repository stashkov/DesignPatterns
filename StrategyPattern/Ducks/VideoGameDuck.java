package Ducks;

import Ducks.QuackStrategy.NoQuackStrategy;

/**
 * This is a video game duck, and consequently it can change it's quacking strategy,
 * as it progresses through the quacking tree skill
 */
public class VideoGameDuck extends Duck
{
    public VideoGameDuck()
    {
        _QUACK_STRATEGY = new NoQuackStrategy();
    }
}
