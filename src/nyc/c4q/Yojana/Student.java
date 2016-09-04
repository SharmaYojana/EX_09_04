package nyc.c4q.Yojana;

    public class Student {

        private String firstname;
        private String lastName;
        private int IDnumber;
        private String favoriteFood;

        public Student(String firstname, String lastName, int IDnumber, String favoriteFood) {
            this.firstname = firstname;
            this.lastName = lastName;
            this.IDnumber = IDnumber;
            this.favoriteFood = favoriteFood;

        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getIDnumber() {
            return IDnumber;
        }

        public void setIDnumber(int IDnumber) {
            this.IDnumber = IDnumber;
        }

        public String getFavoriteFood() {
            return favoriteFood;
        }

        public void setFavoriteFood(String favoriteFood) {
            this.favoriteFood = favoriteFood;
        }
        public static boolean checkSameFavoriteFood(Student s1, Student s2){
            return s1.getFavoriteFood().equalsIgnoreCase(s2.getFavoriteFood());

        }
    }
// command n = create a constructor or getter or setter
