package SolomiaHetman_OOPJAVA_10;

public class Agency {

    private String firm;
        private String work_specialty;
        private String work_conditions;
        private int salary;
        private String people_specialty;
        private float experiance;
        private String education;

        public Agency() {
            this.firm = "none";
            this.work_specialty = "none";
            this.work_conditions = "none";
            this.salary = 0;
            this.people_specialty = "none";
            this.experiance = 0;
            this.education = "none";
        }


        public Agency(String firm, String work_specialty, String work_conditions, int salary, String people_specialty,
                            float experiance, String education) {
            this.firm = firm;
            this.work_specialty = work_specialty;
            this.work_conditions = work_conditions;
            this.salary = salary;
            this.people_specialty = people_specialty;
            this.experiance = experiance;
            this.education = education;
        }


        public String getFirm() {
            System.out.print("Назва фірми: ");
            return firm;
        }



        public void setFirm(final String firm) {
            this.firm = firm;
        }


        public String getWork_specialty() {
            System.out.print("Спеціальність:  ");
            return work_specialty;
        }


        public void setWork_specialty(final String work_specialty) {
            this.work_specialty = work_specialty;
        }


        public int getSalary() {
            System.out.print("Зарплата в гривнях:  ");
            return salary;
        }


        public void setSalary(final int salary) {
            if (salary > 0) {
                this.salary = salary;
            } else {
                return;
            }

        }


        public String getWork_conditions() {
            System.out.print("Умови роботи:  ");
            return work_conditions;
        }


        public void setWork_conditions(final String work_conditions) {
            this.work_conditions = work_conditions;
        }


        public String getPeople_specialty() {
            System.out.print("Спеціальність фахівця:  ");
            return people_specialty;
        }


        public void setPeople_specialty(final String people_specialty) {
            this.people_specialty = people_specialty;
        }


        public float getExperiance() {
            System.out.print("Стаж:  ");
            return experiance;
        }


        public void setExperiance(final float experiance) {
            if (experiance >= 0) {
                this.experiance = experiance;
            } else {
                return;
            }
        }

        public String getEducation() {
            System.out.print("Освіта: ");
            return education;
        }


        public void setEducation(final String education) {
            this.education=education;
        }
    }


