class Resort {
    int RNo, Days;
    String Name;
    float Charges;

    double Compute() {
        double amt = Days * Charges;
        if (amt > 11000)
            amt = amt * 1.02;
        return amt;
    }

    void Getinfo(int r, String n, float c, int d) {
        RNo = r;
        Name = n;
        Charges = c;
        Days = d;
    }

    void DispInfo() {
        System.out.println(RNo + " " + Name + " " + Charges + " " + Days + " Amount: " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo(101, "Riya", 2000, 6);
        r.DispInfo();
    }
}