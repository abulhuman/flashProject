package com.company.model;

public class Photos {
    private int id;
    private String portraitUrl;
    private String pongUrl;
    private int orphanId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public String getPongUrl() {
        return pongUrl;
    }

    public void setPongUrl(String pongUrl) {
        this.pongUrl = pongUrl;
    }

    public int getOrphanId() {
        return orphanId;
    }

    public void setOrphanId(int orphanId) {
        this.orphanId = orphanId;
    }
}
