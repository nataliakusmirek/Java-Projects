public class Bus {

    private int stops;
    private int maxStop;
    private boolean end;
    
    public Bus()
    {
        stops = 1;
        maxStop = 1;
        end = false;
    }

    public Bus(int maxStop)
    {
        this.maxStop = maxStop;
        this.stops = 1;
        this.end = false;
    }

    public int getCurrentStop()
    {
        return stops;
    }

    public void move()
    {
        if (stops > maxStop)
        {
            return maxStop;
            end = true;
        }
        else if (end == true)
        {
            stops--;
        }
        else if (stops < 0)
        {
            stops = 1;
            end = false;
        }
        else 
        {
            stops += 1;
        }
    }
}
