package com.ohgiraffers.test;

public class Song {

    //노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.
    //title : 노래제목
    //artist : 가수
    //country : 국적
    //기본생성자와 매개변수 가지는 생성자활용

    private String title;
    private String artist;
    private String country;

    public Song(){ } //기본생성자 생성

    public Song(String title,String artist,String country){  //매개변수를 가진 생성자
        this.title = title;
        this.artist = artist;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
