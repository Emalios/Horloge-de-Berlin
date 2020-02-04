package fr.emalios.berlin.berlintime;

import fr.emalios.berlin.Date;
import fr.emalios.berlin.enums.LampStringValue;
import fr.emalios.berlin.value.Hours;

public class BerlinHour
{

    private Hours hours;

    public BerlinHour(Date date)
    {
        this.hours = date.getHours();
    }

    private String firstLampLine()
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.hours.numberOfFiveHour(); i++)
        {
            builder.append(LampStringValue.RED_ON.toString());
        }
        while(builder.length() < 4)
        {
            builder.append(LampStringValue.LAMP_OFF.toString());
        }
        return builder.toString();
    }

    private String secondLampLine() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.hours.getMissingHours(); i++)
        {
            builder.append(LampStringValue.RED_ON.toString());
        }
        while(builder.length() < 4)
        {
            builder.append(LampStringValue.LAMP_OFF.toString());
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return firstLampLine()+"\n"+ secondLampLine();
    }


}
