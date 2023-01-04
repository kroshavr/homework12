public class Author {
     protected String firstName;
     protected String secondName;

    public Author (String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString() {
        return firstName + secondName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass())
            return false;
        Author author = (Author) obj;
        if (firstName != this.firstName) return false;
        return obj.equals(secondName);
    }
    @Override
    public int hashCode () {
        int result = secondName == null ? 0 : secondName.hashCode();
        result = result + Integer.parseInt(firstName);
        return result;
    }
}

