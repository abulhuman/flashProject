package com.company.model;

import java.sql.Blob;

public class Photos {
    private int id;
    private Blob portrait;
    private Blob pong;
    private int orphanId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Blob getPortrait() {
        return portrait;
    }

    public void setPortrait(Blob portrait) {
        this.portrait = portrait;
    }

    public Blob getPong() {
        return pong;
    }

    public void setPong(Blob pong) {
        this.pong = pong;
    }

    public int getOrphanId() {
        return orphanId;
    }

    public void setOrphanId(int orphanId) {
        this.orphanId = orphanId;
    }
}
