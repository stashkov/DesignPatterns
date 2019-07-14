package Observable;

import Observer.Observer;

public interface Observable
{
    void registerObserver( Observer observer );

    void unregisterObserver( Observer observer );

    void notifyObservers( );

    void setData( String data );
}
