class animal {
    String name = "animal";
}

class SuperDog extends animal {
    String name = "Dog";

    void show() {
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        SuperDog d = new SuperDog();
        d.show();
    }
}