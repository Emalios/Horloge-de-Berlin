package fr.emalios.berlin.berlintime;

import fr.emalios.berlin.Date;
import fr.emalios.berlin.enums.LampNumber;
import fr.emalios.berlin.enums.LampStringValue;
import fr.emalios.berlin.value.Minutes;

import java.util.ArrayList;
import java.util.List;

public class BerlinMinutes implements BerlinTime
{

    private Minutes minutes;
    private List<Integer> yellowLampPlaceList;

    public BerlinMinutes(Date date)
    {
        this.minutes = date.getMinutes();
        yellowLampPlaceList = new ArrayList<>();
        int[] yellowLampPlace = {1, 2, 4, 5, 7, 8, 10, 11};
        setupArray(yellowLampPlace);
    }

    private void setupArray(int[] ints)
    {
        for (int anInt : ints) {
            this.yellowLampPlaceList.add(anInt);
        }
    }

    private String firstLampLine()
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.minutes.numberOfFiveMinutes(); i++)
        {
            appendString(builder, i+1);
        }
        while(builder.length() < LampNumber.FIRST_MINUTE_LINE.getValue())
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
        return this.yellowLampPlaceList.contains(place);
    }

    private String secondLine()
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.minutes.getMissingMinutes(); i++)
        {
            builder.append(LampStringValue.YELLOW_ON.toString());
        }
        while(builder.length() < LampNumber.SECOND_MINUTE_LINE.getValue())
        {
            builder.append(LampStringValue.LAMP_OFF.toString());
        }
        return builder.toString();
    }

    @Override
    public void display() {
        System.out.println(firstLampLine()+"\n"+secondLine());
    }
}
