class A<T extends Number> {
    private final Class<T> typeOfT;

    public A(Class<T> typeOfT) {
        this.typeOfT = typeOfT;
    }

    public <U extends Number> void method1(U y) {
        System.out.println("Value y: " + y);
        System.out.println("Runtime type of y: " + y.getClass().getName());
        System.out.println("Declared type parameter T is: " + typeOfT.getName());
    }

    public static void main(String[] args) {
        A<Integer> a1 = new A<>(Integer.class);
        a1.method1(5);
    }
}

}
