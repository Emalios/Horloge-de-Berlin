package fr.emalios.berlin;

import fr.emalios.berlin.berlintime.BerlinHour;
import fr.emalios.berlin.berlintime.BerlinMinutes;
import fr.emalios.berlin.berlintime.BerlinSecond;

public class Berlin
{

    public static void main(String[] args) {
       Date date = new Date("11:37:01");
       new BerlinSecond(date).display();
       new BerlinHour(date).display();
       new BerlinMinutes(date).display();
    }

}
