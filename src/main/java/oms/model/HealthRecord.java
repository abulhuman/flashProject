package oms.model;

public class HealthRecord {
    private int id;
    private String medicalCertificateUrl;
    private int orphanId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicalCertificateUrl() {
        return medicalCertificateUrl;
    }

    public void setMedicalCertificateUrl(String medicalCertificateUrl) {
        this.medicalCertificateUrl = medicalCertificateUrl;
    }

    public int getOrphanId() {
        return orphanId;
    }

    public void setOrphanId(int orphanId) {
        this.orphanId = orphanId;
    }
}
