package transport;
import java.util.Objects;
public class Mechanic {
    private String name;
    private String company;
    public Mechanic(String name,String company) {
        this.name = name;
        this.company = company;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void maintenance(){
        System.out.println("Механик " + getName() + " из компании " + getCompany() + " проводит техобслуживание." );
    }
    public void carRepairs(){
        System.out.println("Механик " + getName() + " из компании " + getCompany() + " чинит машину." );
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic mechanic = (Mechanic) o;
        return getName().equals(mechanic.getName()) && getCompany().equals(mechanic.getCompany());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCompany());
    }
}
