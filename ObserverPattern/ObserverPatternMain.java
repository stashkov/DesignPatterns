import Observable.ConcreteObservable;
import Observable.Observable;
import Observer.ConcreteObserver;
import Observer.Observer;

public class ObserverPatternMain
{
    public static void main( String[] args )
    {
        // Create some observers
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        // Create observable
        Observable observable = new ConcreteObservable();

        observable.registerObserver( observer1 );
        observable.registerObserver( observer2 );

        // Set the data and push it to observers
        observable.setData( "an important piece of data" );

        System.out.println("Observer 1 says he received " + observer1.getData());
        System.out.println("Observer 2 says he received " + observer2.getData());

        // Output:
        //        Observer 1 says he received an important piece of data
        //        Observer 2 says he received an important piece of data


        // Remove 2nd observer, leaving only 1st subscribed
        observable.unregisterObserver( observer2 );

        System.out.println("\n");

        // Set the data and push it to observers
        observable.setData( "a not so important piece of data" );

        System.out.println("Observer 1 says he received " + observer1.getData());
        System.out.println("Observer 2 says he received " + observer2.getData());

        // Output:
        //        Observer 1 says he received a not so important piece of data
        //        Observer 2 says he received an important piece of data


    }
}
