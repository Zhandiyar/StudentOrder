package edu.javacourse.studentOrder.domain;

public class CityRegisterResponse {
    private boolean existing; //sychestvyet chel
    private Boolean temperal;//obect class obertka // vremennay register

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemperal() {
        return temperal;
    }

    public void setTemperal(Boolean temperal) {
        this.temperal = temperal;
    }

    @Override
    public String toString() {
        return "CityRegisterCheckerResponse{" +
                "existing=" + existing +
                ", temperal=" + temperal +
                '}';
    }
}
