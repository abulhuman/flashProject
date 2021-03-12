package oms.model;

import java.sql.Blob;

public class Photos {
    private int id;
    private Blob portrait;
    private Blob longPhoto;
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

    public Blob getLongPhoto() {
        return longPhoto;
    }

    public void setLongPhoto(Blob longPhoto) {
        this.longPhoto = longPhoto;
    }

    public int getOrphanId() {
        return orphanId;
    }

    public void setOrphanId(int orphanId) {
        this.orphanId = orphanId;
    }
}
