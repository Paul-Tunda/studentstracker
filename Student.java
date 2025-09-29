package studentstracker;


class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String gender;
    private String countryOfOrigin;

    Student(int studentId, String firstName, String lastName, String emailAddress, String gender, String countryOfOrigin) {

        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.gender = gender;
        this.countryOfOrigin = countryOfOrigin;

    }

    public int getStudentId() {

        return studentId;

    }
    public String getFirstName() {

        return firstName;

    }
    public String getLastName() {

        return lastName;

    }
    public String getEmailAddress() {

        return emailAddress;

    }
    public String getGender() {

        return gender;

    }
    public String getCountryOfOrigin() {

        return countryOfOrigin;

    }

    public void setStudentId(int studentId) {

        this.studentId = studentId;

    }
    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }
    public void setLastName(String lastName) {

        this.lastName = lastName;

    }
    public void setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;

    }
    public void setGender(String gender) {

        this.gender = gender;

    }
    public void setCountryOfOrigin(String countryOfOrigin) {

        this.countryOfOrigin = countryOfOrigin;

    }

    @Override
    public String toString() {

        /*int idColumn = 15;
        int firstNameColumn = 20;
        int lastNameColumn = 20;
        int emailAddressColumn = 50;
        int genderColumn = 10;
        int countryColumn = 50;*/

//        StringBuilder sb = new StringBuilder();

        /*sb.append("| ").append(padRight(String.valueOf(studentId), idColumn));
        sb.append("| ").append(padRight(firstName, firstNameColumn));
        sb.append("| ").append(padRight(lastName, lastNameColumn));
        sb.append("| ").append(padRight(emailAddress, emailAddressColumn));
        sb.append("| ").append(padRight(gender, genderColumn));
        sb.append("| ").append(padRight(countryOfOrigin, countryColumn)).append(" |\n");*/





//        return sb.toString();

        return "Student {" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", gender='" + gender + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';

    }

    /*private String padRight(String s, int n) {

        if (s.length() >= n) {

            return s.substring(0, n);

        }

        return String.format("%-" + n + "s", s);

    }*/

}
