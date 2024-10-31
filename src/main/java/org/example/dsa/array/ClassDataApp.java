package org.example.dsa.array;

public class ClassDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray arr = new ClassDataArray(maxSize);

        arr.insert("Oko", "Chance", 20);
        arr.insert("Ibara", "Chancelle", 21);
        arr.insert("Anga", "Brunel", 24);
        arr.insert("Ondongo", "Grace", 25);
        arr.insert("Ngala", "Benit", 20);

        arr.display();

        String searchKey = "Chance";
        Person found = arr.find(searchKey);
        if (found != null){
            System.out.println("Found");
            found.displayPerson();
        } else
            System.out.println("Can't find " + searchKey);

        System.out.println("Deleting Grace");
        arr.delete("Grace");

        arr.display();

    }
}
