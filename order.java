public class Order {
    private Child[] children = new Child[5];
    private int numChildren = 0;

    public void addChildtoOrder(Child child) {
        if (numChildren < children.length) {
            children[numChildren++] = child;
        }
    }

    public void removeChildfromOrder(Child child) {
        for (int i = 0; i < numChildren; i++) {
            if (children[i] == child) {
                System.arraycopy(children, i + 1, children, i, numChildren - i - 1);
                children[--numChildren] = null;
                break;
            }
        }
    }

    public int getNumofChilds() {
        return numChildren;
    }

    public Child[] getChilds() {
        Child[] activeChildren = new Child[numChildren];
        System.arraycopy(children, 0, activeChildren, 0, numChildren);
        return activeChildren;
    }

    @Override
    public String toString() {
        return "The order contains " + numChildren + " Childs";
    }
}

 class Child {
    private String name;
    private int age;
    private Toy[] toys;

    public Child(String name, int age, Toy[] toys) {
        this.name = name;
        this.age = age;
        this.toys = toys != null ? deepCopyToys(toys) : new Toy[0];
    }

    public Child(Child other) {
        this.name = other.name;
        this.age = other.age;
        this.toys = deepCopyToys(other.toys);
    }

    // Deep copy helper
    private Toy[] deepCopyToys(Toy[] toys) {
        Toy[] copiedToys = new Toy[toys.length];
        for (int i = 0; i < toys.length; i++) {
            Toy t = toys[i];
            copiedToys[i] = new Toy(t.getToyID(), t.getToyName(), t.getToyQuantity(), t.getToyPrice());
        }
        return copiedToys;
    }

    // Getters and setters
    public String getChildName() { return name; }
    public void setChildName(String name) { this.name = name; }
    public int getChildAge() { return age; }
    public void setChildAge(int age) { this.age = age; }
    public Toy[] getChildToy() {
        return toys.length > 0 ? toys : null;
    }
    public void setChildToy(Toy[] toys) { this.toys = deepCopyToys(toys); }
    public int getNumberofToys() { return toys.length; }

    // Dispose of toys
    public void disposeToys() {
        toys = new Toy[0];
    }

    // Donate toys
    public void donate(Child other) {
        if (this != other && this.toys.length > 0) {
            Toy[] combinedToys = new Toy[other.toys.length + this.toys.length];
            System.arraycopy(other.toys, 0, combinedToys, 0, other.toys.length);
            System.arraycopy(this.toys, 0, combinedToys, other.toys.length, this.toys.length);
            other.setChildToy(combinedToys); // Assign combined toys to the other child
            this.disposeToys(); // Dispose the current child's toys
        }
    }

    @Override
    public String toString() {
        return String.format("Child [%s] of age <%d> has (%d) toys", name, age, toys.length);
    }
}

class Toy {
    private int toyID;
    private String toyName;
    private int toyQuantity;
    private double toyPrice;

    public Toy(int toyID, String toyName, int toyQuantity, double toyPrice) {
        this.toyID = toyID;
        this.toyName = toyName;
        this.toyQuantity = toyQuantity;
        this.toyPrice = toyPrice;
    }

    public int getToyID() {
        return toyID;
    }

    public void setToyID(int toyID) {
        this.toyID = toyID;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyQuantity() {
        return toyQuantity;
    }

    public void setToyQuantity(int toyQuantity) {
        this.toyQuantity = toyQuantity;
    }

    public double getToyPrice() {
        return toyPrice;
    }

    public void setToyPrice(double toyPrice) {
        this.toyPrice = toyPrice;
    }

    public String getToyInformation() {
        return String.format("Toy(%d,%s), quantity(%d) with $( %.2f)/toy", toyID, toyName, toyQuantity, toyPrice);
    }
}
