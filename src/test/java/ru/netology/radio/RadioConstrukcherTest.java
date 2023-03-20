package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioConstrukcherTest {
    Radio channel = new Radio();

    @Test
    void channelTest() {
        Radio channel = new Radio();
        Assertions.assertEquals(9, channel.getMaxChannel());
        Assertions.assertEquals(0, channel.getMinChannel());
        Assertions.assertEquals(0, channel.getCurrentChannel());
    }
    @Test
    void changeStationTest() {
        channel.setCurrentChannel(5);

        int expected = 5;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void setUnderChannelMin() {
        channel.setCurrentChannel(-1);
        Assertions.assertEquals(0, channel.getCurrentChannel());
    }
    @Test
    void setOverChannelMax() {
        channel.setCurrentChannel(10);
        Assertions.assertEquals(0, channel.getCurrentChannel());
    }
    @Test
    void nextChannel() {
        channel.setCurrentChannel(8);
        channel.ChannelNext();
        Assertions.assertEquals(9, channel.getCurrentChannel());
    }
    @Test
    void overChannelMax() {
        channel.setCurrentChannel(9);
        channel.ChannelNext();
        Assertions.assertEquals(0, channel.getCurrentChannel());
    }
    @Test
    void PrevChannel() {
        channel.setCurrentChannel(3);
        channel.ChannelPrev();
        Assertions.assertEquals(2, channel.getCurrentChannel());
    }
    @Test
    void BelowMinChannel() {
        channel.setCurrentChannel(0);
        channel.ChannelPrev();
        Assertions.assertEquals(9, channel.getCurrentChannel());
    }

    @Test
    void changeVolume() {
        channel.setCurrentVolume(5);
        Assertions.assertEquals(5, channel.getCurrentVolume());
    }
    @Test
    void overMoreMaxVolume() {
        channel.setCurrentVolume(101);
        channel.increaseVolumeMore();
        Assertions.assertEquals(0, channel.getCurrentVolume());
    }
    @Test
    void increaseVolume() {
        channel.setCurrentVolume(99);
        channel.increaseVolumeMore();
        Assertions.assertEquals(100, channel.getCurrentVolume());
    }
    @Test
    void overMaxVolume() {
        channel.setCurrentVolume(100);
        channel.increaseVolumeLess();
        Assertions.assertEquals(100, channel.getCurrentVolume());
    }
    @Test
    void DecreaseVolume() {
        channel.setCurrentVolume(5);
        channel.increaseVolumeLess();
        Assertions.assertEquals(4, channel.getCurrentVolume());
    }
    @Test
    void BelowMinVolume() {
        channel.setCurrentVolume(0);
        channel.increaseVolumeMore();
        Assertions.assertEquals(0, channel.getCurrentVolume());
    }
    @Test
    void BelowMoreMinVolume() {
        channel.setCurrentVolume(-1);
        channel.increaseVolumeMore();
        Assertions.assertEquals(0, channel.getCurrentVolume());
    }






}
