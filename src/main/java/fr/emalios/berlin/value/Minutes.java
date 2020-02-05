package fr.emalios.berlin.value;

import fr.emalios.berlin.utils.Utils;

public class Minutes
{

    private String stringMinutes;
    private int intMinutes;
    private int missingMinutes;

    public Minutes(char[] minutes)
    {
        this.stringMinutes = Utils.boardToString(minutes);
        this.intMinutes = Integer.parseInt(this.stringMinutes);
    }

    public int numberOfFiveMinutes()
    {
        int i = 0;
        while (i*5 <= intMinutes)
        {
            i++;
        }
        setMissingMinutes(i-1);
        return i-1;
    }

    private void setMissingMinutes(int i) {
        this.missingMinutes = this.intMinutes - (i*5);
    }

    public int getMissingMinutes() {
        return missingMinutes;
    }

}
