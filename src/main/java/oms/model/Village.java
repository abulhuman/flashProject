package oms.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Village {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty registrationDate;
    private final SimpleStringProperty name;
    private final SimpleIntegerProperty districtId;

    public Village() {
        this.id = new SimpleIntegerProperty();
        this.registrationDate = new SimpleStringProperty();
        this.name = new SimpleStringProperty();
        this.districtId = new SimpleIntegerProperty();
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getRegistrationDate() {
        return registrationDate.get();
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate.set(registrationDate);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getDistrictId() {
        return districtId.get();
    }

    public void setDistrictId(int districtId) {
        this.districtId.set(districtId);
    }
}
