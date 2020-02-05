package fr.emalios.berlin.berlintime;

import fr.emalios.berlin.Date;
import fr.emalios.berlin.enums.LampStringValue;
import fr.emalios.berlin.value.Seconds;

public class BerlinSecond implements BerlinTime
{

    private Seconds seconds;

    public BerlinSecond(Date date)
    {
        this.seconds = date.getSeconds();
    }

    @Override
    public void display() {
        if(this.seconds.isPair(seconds))
        {
            System.out.println(LampStringValue.SECOND_ON.toString());
        }
        System.out.println(LampStringValue.LAMP_OFF.toString());
    }
}
