package Observable;

import Observer.Observer;

import java.util.HashSet;

public class ConcreteObservable implements Observable
{
    private HashSet<Observer> _OBSERVER_LIST = new HashSet<>();
    private String _IMPORTANT_DATA;

    @Override
    public void registerObserver( Observer observer )
    {
        _OBSERVER_LIST.add( observer );
    }

    @Override
    public void unregisterObserver( Observer observer )
    {
        _OBSERVER_LIST.remove( observer );
    }

    @Override
    public void notifyObservers()
    {
        _OBSERVER_LIST.forEach( observer -> observer.update( _IMPORTANT_DATA ) );
    }

    @Override
    public void setData( String data )
    {
        _IMPORTANT_DATA = data;
        notifyObservers();
    }
}
