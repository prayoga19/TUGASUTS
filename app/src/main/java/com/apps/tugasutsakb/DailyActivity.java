package com.apps.tugasutsakb;

// tanggal pengerjaan : 11/05/2020
// nim                : 10117151
// nama               : prayoga maulana putra sugiharto
// kelas              : IF4
public class DailyActivity {

    private String Dailyactivity;
    private String Deskripsi;
    private int Photo;

    public DailyActivity() {
    }

    public DailyActivity(String dailyactivity, String deskripsi, int photo) {
        Dailyactivity = dailyactivity;
        Deskripsi = deskripsi;
        Photo = photo;
    }

    //geter

    public String getDailyactivity() {

        return Dailyactivity;
    }

    public String getDeskripsi() {

        return Deskripsi;
    }

    public int getPhoto() {

        return Photo;
    }

    //setter

    public void setDailyactivity(String dailyactivity) {

        this.Dailyactivity = dailyactivity;
    }

    public void setDeskripsi(String deskripsi) {

        this.Deskripsi = deskripsi;
    }

    public void setPhoto(int photo) {

        this.Photo = photo;
    }
}
