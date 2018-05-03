package SolomiaHetman_OOPJAVA_10;

public class Main {

    public static void main(String[] args) {


        Agency[] list=new Agency[2];

        list[0]= new Agency();

        list[0].setFirm("SOFT-SERVE");
        list[0].setWork_specialty("Java Software Engineer");
        list[0].setWork_conditions("Повний день, володіння комп'ютером.");
        list[0].setSalary(15000);
        list[0].setPeople_specialty("Програміст");
        list[0].setExperiance(1);
        list[0].setEducation("Вища");

        System.out.println(list[0].getFirm());
        System.out.println(list[0].getWork_specialty());
        System.out.println(list[0].getWork_conditions());
        System.out.println(list[0].getSalary());
        System.out.println(list[0].getPeople_specialty());
        System.out.println(list[0].getExperiance());
        System.out.println(list[0].getEducation());



    }


}
