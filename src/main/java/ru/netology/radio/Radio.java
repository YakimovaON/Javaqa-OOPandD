package ru.netology.radio;

public class Radio {
    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void ChannelNext() {
        if (currentChannel != 9) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
    }

    public void ChannelPrev() {
        if (currentChannel != 0) {
            currentChannel++;
        } else {
            currentChannel = 9;
        }
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0) {
            return;
        }
        if (currentChannel > 9) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolumeLess() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void increaseVolumeMore() {
        if (currentVolume > 0) {
            currentVolume = currentVolume + 1;
        }
    }


}
