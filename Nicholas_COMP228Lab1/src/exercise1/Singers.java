// COMP228-406 - Lab 1 - Nicholas Bonneville
// Lab 1 - Exercise 1

// Write a Java application that creates a Java console application to keep records of singers and displays stored records.

package exercise1;

public class Singers {

    // Instance variables.
    private int singerID;
    private String singerName;
    private String singerAddress;
    private String singerDateOfBirth;
    private int albumsPublished;

    // Constructor with no arguments.
    public Singers() {
        this.singerID = 0;
        this.singerName = null;
        this.singerAddress = null;
        this.singerDateOfBirth = null;
        this.albumsPublished = 0;
    }

    // Constructor with all 5 arguments.
    public Singers(int singerID, String singerName, String singerAddress, String singerDateOfBirth, int albumsPublished) {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.singerDateOfBirth = singerDateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    // Setters for instance variables of class Singers.
    public void setSingerID(int singerID) { this.singerID = singerID; }
    public void setSingerName(String singerName) { this.singerName = singerName; }
    public void setSingerAddress(String singerAddress) { this.singerAddress = singerAddress; }
    public void setSingerDateOfBirth(String singerDateOfBirth) { this.singerDateOfBirth = singerDateOfBirth; }
    public void setAlbumsPublished(int albumsPublished) { this.albumsPublished = albumsPublished; }

    // Setter to set all instance variables of class Singers at once.
    public void setAllSingerValues(int singerID, String singerName, String singerAddress, String singerDateOfBirth, int albumsPublished) {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.singerDateOfBirth = singerDateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    // Getters for instance variables of class Singers.
    public int getSingerID() { return singerID; }
    public String getSingerName() { return singerName; }
    public String getSingerAddress() { return singerAddress; }
    public String getSingerDateOfBirth() { return singerDateOfBirth; }
    public int getAlbumsPublished() { return albumsPublished; }
}