package fr.emalios.berlin.value;

import fr.emalios.berlin.utils.Utils;

import java.util.List;

public class Seconds
{

    private String seconds;

    public Seconds(char[] seconds)
    {
        this.seconds = Utils.boardToString(seconds);
    }

    public boolean isPair(Seconds stringSeconds) {
        int seconds = Integer.parseInt(stringSeconds.toString());
        return (seconds % 2 == 0);
    }

    @Override
    public String toString() {
        return this.seconds;
    }
}
