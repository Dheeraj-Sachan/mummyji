package com.example.mummyji.service;

public class Doctor {
    int docId;
    String doctorName;
    String doctorHospital;

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorHospital() {
        return doctorHospital;
    }

    public void setDoctorHospital(String doctorHospital) {
        this.doctorHospital = doctorHospital;
    }

    public Doctor(int docId, String doctorName, String doctorHospital) {
        this.docId = docId;
        this.doctorName = doctorName;
        this.doctorHospital = doctorHospital;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "docId=" + docId +
                ", doctorName='" + doctorName + '\'' +
                ", doctorHospital='" + doctorHospital + '\'' +
                '}';
    }
}
