import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

        @Test
        void radioStation() {
            Radio radio = new Radio();
            radio.setRadioStationNumber(-1);
            int actual = radio.getRadioStationNumber();
            int expected = 0;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void incorrectRadioStation() {
            Radio radio = new Radio();
            radio.setRadioStationNumber(10);
            int actual = radio.getRadioStationNumber();
            int expected = 9;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void truthRadioStation() {
            Radio radio = new Radio();
            radio.setRadioStationNumber(7);
            int actual = radio.getRadioStationNumber();
            int expected = 7;

            Assertions.assertEquals(expected, actual);
        }

        // тест для кнопки следующая
        @Test
        void nextStation() {
            Radio radio = new Radio();
            radio.setRadioStationNumber(7);
            radio.nextStation();
            int actual = radio.getRadioStationNumber();
            int expected = 8;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void truthNextStation() {
            Radio radio = new Radio();
            radio.setRadioStationNumber(9);
            radio.nextStation();
            int actual = radio.getRadioStationNumber();
            int expected = 0;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void moreNextStation() {
            Radio radio = new Radio();
            radio.setRadioStationNumber(10);
            radio.nextStation();
            int actual = radio.getRadioStationNumber();
            int expected = 0;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void equallyNextStation() {
            Radio radio = new Radio();
            radio.setRadioStationNumber(9);
            radio.nextStation();
            int actual = radio.getRadioStationNumber();
            int expected = 0;

            Assertions.assertEquals(expected, actual);
        }


        // тест для предыдущей
        @Test
        void prevStation() {
            Radio radio = new Radio();
            radio.setRadioStationNumber(9);
            radio.prevStation();
            int actual = radio.getRadioStationNumber();
            int expected = 8;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void truthPrevStation() {
            Radio radio = new Radio();
            radio.setRadioStationNumber(0);
            radio.prevStation();
            int actual = radio.getRadioStationNumber();
            int expected = 9;

            Assertions.assertEquals(expected, actual);

        }

        // Тест для звука
        @Test
        void soundVolume() {
            Radio radio = new Radio();
            radio.setSoundVolume(9);
            int actual = radio.getSoundVolume();
            int expected = 9;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void incorrectSoundVolume() {
            Radio radio = new Radio();
            radio.setSoundVolume(-1);
            int actual = radio.getSoundVolume();
            int expected = 0;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void moreSoundVolume() {
            Radio radio = new Radio();
            radio.setSoundVolume(11);
            int actual = radio.getSoundVolume();
            int expected = 0;

            Assertions.assertEquals(expected, actual);

        }

        // Тест для макисмума
        @Test
        void incorrectMaxVolume() {
            Radio radio = new Radio();
            radio.setSoundVolume(10);
            radio.maxVolume();
            int actual = radio.getSoundVolume();
            int expected = 0;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void maxVolume() {
            Radio radio = new Radio();
            radio.setSoundVolume(7);
            radio.maxVolume();
            int actual = radio.getSoundVolume();
            int expected = 8;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void minVolume() {
            Radio radio = new Radio();
            radio.setSoundVolume(0);
            radio.minVolume();
            int actual = radio.getSoundVolume();
            int expected = 0;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void truthMinVolume() {
            Radio radio = new Radio();
            radio.setSoundVolume(7);
            radio.minVolume();
            int actual = radio.getSoundVolume();
            int expected = 6;

            Assertions.assertEquals(expected, actual);
        }
    }
