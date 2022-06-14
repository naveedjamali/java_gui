package odai;

public class Employee {
    //initialize person common attribute
    String name, id;

    String designation;

    //set initial value when create new instance
    public Employee(String name, String id, String designation) {

        super();

        this.name = name;

        this.id = id;

        this.designation = designation;

    }


    /**
     * @return the name
     */

    public String getName() {

        return name;

    }


// name the name to set


    public void setName(String name) {

        this.name = name;

    }

    /**
     * @return the id
     */

    public String getId() {

        return id;

    }


// id the id to set


    public void setId(String id) {

        this.id = id;

    }

    /**
     * @return the designation
     */

    public String getDesignation() {

        return designation;

    }


// designation the designation to set


    public void setDesignation(String designation) {

        this.designation = designation;

    }

    /* (non-Javadoc)

     * @see java.lang.Object#toString()

     */

    @Override


    public String toString() {

        return "Employee [name=" + name + ", id=" + id + ", designation=" + designation + "]";

    }

}