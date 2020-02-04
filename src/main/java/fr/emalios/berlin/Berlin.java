package fr.emalios.berlin;

import fr.emalios.berlin.berlintime.BerlinHour;
import fr.emalios.berlin.berlintime.BerlinSecond;

public class Berlin
{

    public static void main(String[] args) {
       Date date = new Date("23:59:59");
       System.out.println(new BerlinSecond(date).toString());
       System.out.println(new BerlinHour(date).toString());
        System.out.println(new BerlinMinutes(date).toString());
    }

}
