package fr.emalios.berlin.berlintime;

import fr.emalios.berlin.Date;
import fr.emalios.berlin.enums.LampStringValue;
import fr.emalios.berlin.value.Minutes;

import java.util.ArrayList;
import java.util.List;

public class BerlinMinutes
{

    private Minutes minutes;
    private List<Integer> yellowLampPlaceList;
    private int[] yellowLampPlace = {1,2,4,5,7,8,10,11};

    public BerlinMinutes(Date date)
    {
        this.minutes = date.getMinutes();
        yellowLampPlaceList = new ArrayList<>();
        setupArray(this.yellowLampPlace);
    }

    private void setupArray(int[] ints)
    {
        for (int anInt : ints) {
            this.yellowLampPlaceList.add(anInt);
        }
    }

    public String firstLampLine()
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.minutes.numberOfFiveMinutes(); i++)
        {
            appendString(builder, i+1);
        }
        while(builder.length() < 11)
        {
            builder.append(LampStringValue.LAMP_OFF.toString());
        }
        return builder.toString();
    }

    private void appendString(StringBuilder builder, int i)
    {
        if(isYellowLamp(i))
        {
            builder.append(LampStringValue.YELLOW_ON.toString());
            return;
        }
        builder.append(LampStringValue.RED_ON.toString());
    }

    private boolean isYellowLamp(int place)
    {
        if (this.yellowLampPlaceList.contains(place))
        {
            //System.out.println("c'est un yello avec i = " + place);
            return true;
        }
        return false;
    }

    public String secondLine()
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.minutes.getMissingMinutes(); i++)
        {
            builder.append(LampStringValue.YELLOW_ON.toString());
        }
        while(builder.length() < 4)
        {
            builder.append(LampStringValue.LAMP_OFF.toString());
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return firstLampLine()+"\n"+secondLine();
    }
}
