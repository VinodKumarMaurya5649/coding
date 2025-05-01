abstract class RoyalMember {
    private String name;

    public RoyalMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void command();
}

class King extends RoyalMember {
    public King(String name) {
        super(name);
    }

    @Override
    public void command() {
        System.out.println(getName() + " commands the kingdom to prepare for war!");
    }
}

class Queen extends RoyalMember {
    public Queen(String name) {
        super(name);
    }

    @Override
    public void command() {
        System.out.println(getName() + " commands the kingdom to focus on diplomacy!");
    }
}

class Army {
    private String generalName;

    public Army(String generalName) {
        this.generalName = generalName;
    }

    public void followOrders() {
        System.out.println("The army, led by General " + generalName + ", is following orders.");
    }
}

public class AbstractImplementation{
    public static void main(String[] args) {
        King king = new King("King Vinod  ");
        Queen queen = new Queen("Queen is loding...");
        Army army = new Army("General Jinwoo");

        king.command();
        queen.command();
        army.followOrders();
    }
}