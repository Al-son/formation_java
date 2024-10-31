package org.example.dsa.array;

public class ClassDataArray {
    private Person[] arr;
    private int nElems;

    public ClassDataArray(int maxSize) {
        arr = new Person[maxSize];
        nElems = 0;
    }

    public Person find(String searchName) {
        int j;
        for (j = 0; j < nElems; j++)
            if (arr[j].getLastName().equals(searchName))
                break;
        if (j == nElems)
            return null;
        else
            return arr[j];

    }

    public void insert(String lastName, String firstName, int age) {
        arr[nElems] = new Person(lastName, firstName, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < nElems; j++)
            if (arr[j].getLastName().equals(searchName))
                break;
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                arr[k] = arr[k + 1];
            nElems--;
            return true;
        }
    }

    public void display(){
        for (int j = 0; j < nElems; j++)
            arr[j].displayPerson();
    }

}
