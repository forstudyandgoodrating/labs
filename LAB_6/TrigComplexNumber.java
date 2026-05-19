public class TrigComplexNumber {
    double r;
    double phi;

    public void inputData(double r, double phi) {
        this.r = r;
        this.phi = phi;
    }

    public void printData() {
        System.out.printf("Число: %.2f * [cos(%.2f) + i * sin(%.2f)]\n", r, phi, phi);
    }

    public void power(int n) {
        double newR = Math.pow(r, n);
        double newPhi = phi * n;
        System.out.printf("У степені %d: %.2f * [cos(%.2f) + i * sin(%.2f)]\n", n, newR, newPhi, newPhi);
    }
}