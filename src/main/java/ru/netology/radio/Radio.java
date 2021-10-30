package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int volume;

    public int setVolume(int value){
        return volume = value;
    }

    public int getVolume(){
        return volume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

// Требования к работе с радиостанциями:

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0 || newCurrentStation > 9) {
            return;
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void setNextStation(){
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void setPreviousStation(){
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

// Требования к работе с уровнем громкости звука:

    public void increaseVolume() {
        if (volume == 10) {
            return;
        } else {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume == 0) {
            return;
        } else {
            volume = volume - 1;
        }
    }


}

