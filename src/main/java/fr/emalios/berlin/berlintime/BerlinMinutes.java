package fr.emalios.berlin.berlintime;

import fr.emalios.berlin.Date;
import fr.emalios.berlin.value.Minutes;

public class BerlinMinutes
{

    private Minutes minutes;

    public BerlinMinutes(Date date)
    {
        this.minutes = date.getMinutes();
    }

    public String firstLampLine()
    {

    }

    @Override
    public String toString() {
        return firstLampLine();
    }
}
