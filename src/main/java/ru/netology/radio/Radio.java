package ru.netology.radio;

public class Radio {
    private int currentChannel;
    private int maxChannel;
    private int minChannel = 0;
    private int countStationsRadio = 10;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio() {
        this.maxChannel = 9;
        this.minChannel = 0;

    }

    public Radio(int countStationsRadio) {

        this.maxChannel = minChannel + countStationsRadio - 1;
    }

    public int getCurrentChannel() {

        return currentChannel;
    }

    public int getMaxChannel() {

        return maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void ChannelNext() {
        if (currentChannel != maxChannel) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
    }

    public void ChannelPrev() {
        if (currentChannel != minChannel) {
            currentChannel--;
        } else {
            currentChannel = maxChannel;
        }
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0) {
            return;
        }
        if (currentChannel > maxChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolumeLess() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseVolumeMore() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume + 1;
        }
    }


}
