package fr.emalios.berlin.berlintime;

import fr.emalios.berlin.Date;
import fr.emalios.berlin.enums.LampStringValue;
import fr.emalios.berlin.value.Seconds;

public class BerlinSecond
{

    private Seconds seconds;

    public BerlinSecond(Date date)
    {
        this.seconds = date.getSeconds();
    }

    @Override
    public String toString() {
        if(this.seconds.isPair(seconds))
        {
            return LampStringValue.SECOND_ON.toString();
        }
        return LampStringValue.LAMP_OFF.toString();
    }

}
