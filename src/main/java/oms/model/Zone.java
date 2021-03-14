package oms.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Zone {
    private SimpleIntegerProperty id;
    private SimpleStringProperty name;
    private SimpleIntegerProperty regionId;

    public Zone(){
        this.id = new SimpleIntegerProperty();
        this.name = new SimpleStringProperty();
        this.regionId = new SimpleIntegerProperty();
    }


    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getRegionId() {
        return regionId.get();
    }

    public void setRegionId(int regionId) {
        this.regionId.set(regionId);
    }
}
