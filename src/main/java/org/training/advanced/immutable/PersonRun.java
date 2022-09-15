package org.training.advanced.immutable;

public class PersonRun {
    public static void main(String[] args) {
        PersonMutable personMutable = new PersonMutable();
        personMutable.setName("osman");
        personMutable.setSurname("yaycıoğlu");
        // code 1
        System.out.println("xyz");
        personMutable.setDepartment("IT");
        personMutable.setHeight(200);

        PersonMutable personMutable1 = new PersonMutable("osman",
                                                         "yaycıoğlu",
                                                         "IT",
                                                         2000);

        PersonMutable personMutable2 = PersonMutable.createPerson()
                                                    .setName("osman")
                                                    .setSurname("yaycıoğlu")
                                                    .setDepartment("IT")
                                                    .setHeight(200);
    }
}
