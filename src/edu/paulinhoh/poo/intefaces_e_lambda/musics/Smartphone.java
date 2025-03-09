package edu.paulinhoh.poo.intefaces_e_lambda.musics;

public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Smartphone: playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Smartphone: pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Smartphone: stoping music");
    }

    @Override
    public void playVideo() {
        System.out.println("Smartphone: reproducing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Smartphone: pausing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Smartphone: stoping music");
    }

}