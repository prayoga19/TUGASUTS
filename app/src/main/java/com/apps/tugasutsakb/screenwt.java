package com.apps.tugasutsakb;

// tanggal pengerjaan : 07/05/2020
// nim                : 10117151
// nama               : prayoga maulana putra sugiharto
// kelas              : IF4
public class screenwt {
    String Title,Description;
    int ScreenImg;

    public screenwt(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }


}
