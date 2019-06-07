package ir.maktabsharif;

class Cat extends Animal {

    private BreedType breed;


    Cat(String name) {
        super.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Cat cat = (Cat) obj;
        boolean status = false;
        if (this.name.equalsIgnoreCase(cat.name)) {
            status = true;
        }
        return status;
    }


    String getBreed() {
        return breed.toString();
    }

    BreedType getBreed2(){
        return breed;
    }

    void setBreed(BreedType breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed=" + breed +
                ", name='" + name + '\'' +
                '}';
    }
}
