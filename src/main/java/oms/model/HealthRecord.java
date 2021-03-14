package oms.model;

import java.sql.Blob;

public class HealthRecord {
    private int id;
    private Blob medicalCertificate;
    private int orphanId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Blob getMedicalCertificateUrl() {
        return medicalCertificate;
    }

    public void setMedicalCertificate(Blob medicalCertificate) {
        this.medicalCertificate = medicalCertificate;
    }

    public int getOrphanId() {
        return orphanId;
    }

    public void setOrphanId(int orphanId) {
        this.orphanId = orphanId;
    }
}
