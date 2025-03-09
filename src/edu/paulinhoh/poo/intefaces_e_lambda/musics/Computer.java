package edu.paulinhoh.poo.intefaces_e_lambda.musics;

public class Computer implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Computer: playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Computer: pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Computer: stoping music");
    }

    @Override
    public void playVideo() {
        System.out.println("Computer: reproducing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Computer: pausing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Computer: stoping music");
    }
}