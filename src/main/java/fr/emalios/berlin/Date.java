package fr.emalios.berlin;

import fr.emalios.berlin.value.Hours;
import fr.emalios.berlin.value.Minutes;
import fr.emalios.berlin.value.Seconds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date
{

    private String date;

    private Seconds seconds;
    private Minutes minutes;
    private Hours hours;

    public Date(String date)
    {
        this.date = date;
        separateHour();
    }

    private void separateHour()
    {
        String[] split = this.date.split(":");
        this.seconds = new Seconds(split[2].toCharArray());
        this.minutes = new Minutes(split[1].toCharArray());
        this.hours = new Hours(split[0].toCharArray());
    }

    @Override
    public String toString() {
        return this.date;
    }

    public Seconds getSeconds() {
        return this.seconds;
    }

    public Hours getHours() {
        return this.hours;
    }

    public Minutes getMinutes() {
        return minutes;
    }
}
