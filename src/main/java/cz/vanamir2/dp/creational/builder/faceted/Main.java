package cz.vanamir2.dp.creational.builder.faceted;

public class Main {


    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb.lives()
                .at("Ke Hradu 124")
                .in("Sloup v Cechach")
                .withPostcode("47152")
                .works()
                .asA("Programmer")
                .earning(200)
                .at("ABRA")
                .build();
        System.out.println(person);
    }
}
