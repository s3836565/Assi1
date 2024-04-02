package model;
import java.util.List;
public class PolicyHolder extends Customer {
    private List<Dependent> dependents;

    public List<Dependent> getDependents() {
        return dependents;
    }

    public void setDependents(List<Dependent> dependents) {
        this.dependents = dependents;
    }

    public PolicyHolder(String id, String fullName, InsuranceCard insuranceCard, List<Dependent> dependents) {
        super(id, fullName, insuranceCard);
        this.dependents = dependents;
    }
// Constructor, getters, and setters...
}