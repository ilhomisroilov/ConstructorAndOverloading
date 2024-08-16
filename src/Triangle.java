public class Triangle {
    private double katet1;
    private double katet2;
    private double gipotenuza;


    public Triangle(double katet1, double katet2, double gipotenuza) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotenuza = gipotenuza;
    }

    // Getters and Setters
    public double getKatet1() {
        return katet1;
    }

    public void setKatet1(double katet1) {
        this.katet1 = katet1;
    }

    public double getKatet2() {
        return katet2;
    }

    public void setKatet2(double katet2) {
        this.katet2 = katet2;
    }

    public double getGipotenuza() {
        return gipotenuza;
    }

    public void setGipotenuza(double gipotenuza) {
        this.gipotenuza = gipotenuza;
    }


    public double calculateArea() {
        return (katet1 * katet2) / 2;
    }

    public double calculateArea(int katet1, int katet2) {
        return (katet1 * katet2) / 2.0;
    }

    public double calculateArea(float katet1, float katet2) {
        return (katet1 * katet2) / 2.0f;
    }

    public double calculateArea(long katet1, long katet2) {
        return (katet1 * katet2) / 2.0;
    }

    public double calculatePerimeter() {
        return katet1 + katet2 + gipotenuza;
    }

    public double calculatePerimeter(int katet1, int katet2, int hypotenuse) {
        return katet1 + katet2 + hypotenuse;
    }

    public double calculatePerimeter(float katet1, float katet2, float hypotenuse) {
        return katet1 + katet2 + hypotenuse;
    }

    public double calculatePerimeter(long katet1, long katet2, long hypotenuse) {
        return katet1 + katet2 + hypotenuse;
    }
}
