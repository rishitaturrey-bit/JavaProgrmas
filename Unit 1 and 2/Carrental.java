class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {
        if (CarType.equals("Small Car")) Rent = 1000;
        else if (CarType.equals("Van")) Rent = 800;
        else if (CarType.equals("SUV")) Rent = 2500;
        return Rent;
    }

    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + GetRent());
    }

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar(1, "SUV");
        c.ShowCar();
    }
}