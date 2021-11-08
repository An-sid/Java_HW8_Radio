package ru.netology.radio;

public class Radio {
    private int amountOfStations = 10;
    private int currentStation = 0;
    private int volume = 0;

    public Radio () {}

    public Radio(int amountOfStations, int currentStation, int volume) {
        this.amountOfStations = amountOfStations;
        this.currentStation = currentStation;
        this.volume = volume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

// Требования к работе с радиостанциями:

    public void setStation(int station) {
        if (station < 0 || station >= amountOfStations) {
            return;
        } else {
            currentStation = station;
        }
    }

    public int nextStation(){
        if (currentStation == amountOfStations-1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }   return currentStation;
    }

    public int previousStation(){
        if (currentStation == 0) {
            currentStation = amountOfStations - 1;
        } else {
            currentStation = currentStation - 1;
        } return currentStation;
    }

// Требования к работе с уровнем громкости звука:

    public int increaseVolume() {
        if (volume == 100) {
            return volume;
        } else {
            return volume + 1;
        }
    }

    public int decreaseVolume() {
        if (volume == 0) {
            return volume;
        } else {
            return volume - 1;
        }
    }

}

