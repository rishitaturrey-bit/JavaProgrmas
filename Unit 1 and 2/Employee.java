class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata(int no, String name, float b, float h, float d) {
        empno = no;
        ename = name;
        basic = b;
        hra = h;
        da = d;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " NetPay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata(1, "Riya", 10000, 2000, 1500);
        e.dispdata();
    }
}