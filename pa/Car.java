package pa;

class Car {
    private int num;
    private double gas;

    public Car() {
        this.num = 0;
        this.gas = 0;
        System.out.println("已生產了汽車");
    }

    public void setCar(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("將車號設為" + this.num + "汽油量設為" + this.gas);
    }

    public void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}
