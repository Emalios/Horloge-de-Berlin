package fr.emalios.berlin.enums;

public enum LampStringValue
{

    SECOND_ON("A"),
    LAMP_OFF("O"),
    RED_ON("R"),
    YELLOW_ON("Y");

    private String value;

    LampStringValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
