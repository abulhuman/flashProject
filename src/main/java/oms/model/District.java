package oms.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class District {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty name;
    private final SimpleIntegerProperty zoneId;
    private final SimpleIntegerProperty coordinatorId;

    public District() {
        this.id = new SimpleIntegerProperty();
        this.name = new SimpleStringProperty();
        this.zoneId = new SimpleIntegerProperty();
        this.coordinatorId   = new SimpleIntegerProperty();
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

    public int getZoneId() {
        return zoneId.get();
    }

    public void setZoneId(int zoneId) {
        this.zoneId.set(zoneId);
    }

    public int getCoordinatorId() {
        return coordinatorId.get();
    }

    public void setCoordinatorId(int coordinatorId) {
        this.coordinatorId.set(coordinatorId);
    }
}
