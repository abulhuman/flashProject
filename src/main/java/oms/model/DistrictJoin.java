package oms.model;

public class DistrictJoin {
    private District district;
    private Zone zone;
    private Coordinator coordinator;

    public DistrictJoin() {
        this.district = new District();
        this.zone = new Zone();
        this.coordinator = new Coordinator();
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Coordinator coordinator) {
        this.coordinator = coordinator;
    }
}
