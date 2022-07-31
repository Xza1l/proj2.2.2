package web.Model;

public class Car {
    String model;
    int series;
    int Km;

    public Car() {
    }

    public Car(String model, int series, int km) {
        this.model = model;
        this.series = series;
        Km = km;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int km) {
        Km = km;
    }
}
