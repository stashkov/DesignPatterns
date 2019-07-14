package Observer;

public class ConcreteObserver implements Observer
{
    private String _IMPORTANT_DATA;

    @Override
    public void update( String data )
    {
        _IMPORTANT_DATA = data;
    }

    @Override
    public String getData()
    {
        return _IMPORTANT_DATA;
    }
}
