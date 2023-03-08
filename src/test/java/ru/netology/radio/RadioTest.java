package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void CurrentChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(5);

        int expected = 5;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextCurrentChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(10);

        int expected = 0;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevCurrentChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(-1);

        int expected = 0;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextMinChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(1);

        int expected = 1;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevMaxChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(8);

        int expected = 8;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextMaxChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(8);
        channel.ChannelNext();

        int expected = 9;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextFirstChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(9);
        channel.ChannelNext();

        int expected = 0;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevFirstChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(0);
        channel.ChannelPrev();

        int expected = 9;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNextChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(1);
        channel.ChannelPrev();

        int expected = 2;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void CurrentVolume() {
        Radio channel = new Radio();
        channel.setCurrentVolume(9);

        int expected = 9;
        int actual = channel.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void moreMaxCurrentVolume() {
        Radio channel = new Radio();
        channel.setCurrentVolume(11);

        int expected = 0;
        int actual = channel.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void lessMinCurrentVolume() {
        Radio channel = new Radio();
        channel.setCurrentVolume(-1);

        int expected = 0;
        int actual = channel.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextMinCurrentVolume() {
        Radio channel = new Radio();
        channel.setCurrentVolume(1);

        int expected = 1;
        int actual = channel.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void lessFirstVolume() {
        Radio channel = new Radio();
        channel.setCurrentVolume(10);
        channel.increaseVolumeLess();

        int expected = 0;
        int actual = channel.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void moreFirstVolume() {
        Radio channel = new Radio();
        channel.setCurrentVolume(1);
        channel.increaseVolumeLess();

        int expected = 2;
        int actual = channel.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MaxCurrentVolume() {
        Radio channel = new Radio();
        channel.setCurrentVolume(10);

        int expected = 10;
        int actual = channel.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextFirstVolume() {
        Radio channel = new Radio();
        channel.setCurrentVolume(0);
        channel.increaseVolumeLess();

        int expected = 1;
        int actual = channel.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
