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
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Author author = (Author) obj;
        return firstName + secondName == author.firstName + author.secondName;
    }

    public int hashCode () {
        return java.util.Objects.hash(firstName, secondName);
    }
}

