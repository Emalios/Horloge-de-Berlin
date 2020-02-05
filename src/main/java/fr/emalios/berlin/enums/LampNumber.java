package fr.emalios.berlin.enums;

public enum LampNumber
{

    HOUR_LINE(4),
    FIRST_MINUTE_LINE(11),
    SECOND_MINUTE_LINE(4);

    private int value;

    LampNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
