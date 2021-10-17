package cz.vanamir2.dp.creational.builder.faceted;

// Builder facede
public class PersonBuilder {

    // the object we're going to build
    protected Person person = new Person(); // reference!

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public Person build() {
        return person;
    }
}
