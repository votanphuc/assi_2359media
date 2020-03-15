package main.java.com.media2359.assigment.util;

public class RoosterLang {

    public static String getSound() {
        switch (Language.getLocale()) {
            case DANISH:
                return "kykyliky";
            case DUTCH:
                return "kukeleku";
            case FINNISH:
                return "kukko kiekuu";
            case FRENCH:
                return "cocorico";
            case GERMAN:
                return "kikeriki";
            case GREED:
                return "kikiriki";
            case HEBREW:
                return "coo-koo-ri-koo";
            case HUNGARIAN:
                return "kukuriku";
            case ITALIAN:
                return "chicchirichi";
            case JAPANESE:
                return "ko-ke-kok-ko-o";
            case PORTUGUESE:
                return "cucurucu";
            case RUSSIAN:
                return "kukareku";
            case SWEDISH:
                return "kuckeliku";
            case TURKISH:
                return "kuk-kurri-kuuu";
            case URDU:
                return "kuklooku";
            case ENGLISH:
            default:
                return "Cock-a-doodle-doo";
        }
    }
}
