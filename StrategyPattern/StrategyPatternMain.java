import Ducks.Duck;
import Ducks.OrdinaryDuck;
import Ducks.QuackStrategy.StandardQuackStrategy;
import Ducks.RubberDuck;
import Ducks.VideoGameDuck;

public class StrategyPatternMain
{
    public static void main( String[] args )
    {
        Duck sirQuackALot = new OrdinaryDuck();
        sirQuackALot.quack();  // standard quack

        System.out.println( "--------------------" );

        Duck debuggingExpert = new RubberDuck();
        debuggingExpert.quack();  // cannot quack

        System.out.println( "--------------------" );

        Duck videoGameDuck = new VideoGameDuck();
        videoGameDuck.quack(); // cannot quack
        videoGameDuck.setQuackStrategy( new StandardQuackStrategy() );  // our duck's learned a new skill!
        videoGameDuck.quack();  // it's default quack is now a standard quack, instead of no quack


    }
}
