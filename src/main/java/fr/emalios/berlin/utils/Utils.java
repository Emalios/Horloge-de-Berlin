package fr.emalios.berlin.utils;

public class Utils
{

    public static String boardToString(char[] chars)
    {
        StringBuilder builder = new StringBuilder();
        for (Character character : chars) {
            builder.append(character);
        }
        return builder.toString();
    }

}
