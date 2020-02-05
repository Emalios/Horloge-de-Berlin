package fr.emalios.berlin.value;

import fr.emalios.berlin.utils.Utils;

public class Hours
{

    private String stringHours;
    private int intHours;

    private int missingHours;

    public Hours(char[] hours)
    {
        this.stringHours = Utils.boardToString(hours);
        this.intHours = Integer.parseInt(this.stringHours);
    }

    public int numberOfFiveHours()
    {
        int i = 0;
        while (i*5 <= intHours)
        {
            i++;
        }
        setMissingHours(i-1);
        return i-1;
    }

    public void setMissingHours(int i)
    {
        this.missingHours = this.intHours - (i*5);
    }

    public int getMissingHours()
    {
        return this.missingHours;
    }

    @Override
    public String toString() {
        return this.stringHours;
    }
}
