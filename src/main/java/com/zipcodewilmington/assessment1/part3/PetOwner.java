package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    private String name = "";
    private Pet[] pets = new Pet[0];

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        if (name != null) {
            this.name = name;
        }

        if (pets != null) {
            this.pets = new Pet[this.pets.length + pets.length];
            for (int i = 0; i < pets.length; i++) {
                this.pets[i] = pets[i];
                pets[i].setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if (this.pets != null) {
            Pet[] newArr = new Pet[this.pets.length + 1];
            for (int i = 0; i < this.pets.length; i++) {
                newArr[i] = this.pets[i];
            }
            newArr[newArr.length - 1] = pet;
            this.pets = newArr;
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        ArrayList<Pet> temp = new ArrayList<>();
        for (Pet p : this.pets) {
            if (!p.equals(pet)) {
                temp.add(p);
            }
        }

        Pet[] newArr = new Pet[temp.size() + 1];
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = temp.get(i);
        }
        this.pets = newArr;
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if (this.pets != null) {
            for (Pet p : this.pets) {
                if (p.equals(pet)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int lowestAge = Integer.MAX_VALUE;
        if (this.pets != null) {
            for (Pet p : this.pets) {
                if (p.getAge() < lowestAge) {
                    lowestAge = p.getAge();
                }
            }
        }
        return lowestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int lowestAge = 0;
        if (this.pets != null) {
            for (Pet p : this.pets) {
                if (p.getAge() > lowestAge) {
                    lowestAge = p.getAge();
                }
            }
        }
        return lowestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sum = 0;
        int numOf = 0;
        if (this.pets != null) {
            numOf = this.pets.length;
            for (Pet p : this.pets) {
                sum += p.getAge();
            }
        }
        return (float)sum / numOf;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        if (this.pets != null) {
            return this.pets.length;
        }
        return 0;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
