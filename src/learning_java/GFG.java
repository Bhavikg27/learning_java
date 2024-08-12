class Test {
    int x;

    Test(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Test obj = new Test(5);
        System.out.println(obj.x);
    }
}
