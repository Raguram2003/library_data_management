
class Library_item {
    private int id;
    private String title;
    private int year;

    public int getId(int id){
        return id;
    }
    public int getYear(int year){
        return year;
    }

    public String getTitle(String title)
    {
        return title;
    }

}
class Book extends Library_item
{
    String Author;
    public void Author(int id,String title,int year ,String Author)
    {
        System.out.println(super.getId(id) +" "+ super.getTitle(title)+" "+super.getYear(year)+" "+ Author);
    }

}
class Magazine extends Library_item
{
    int issue;
    public void Issue(int id,String title,int year ,int issue)
    {
        System.out.println(super.getId(id) +" "+ super.getTitle(title)+" "+super.getYear(year)+" "+ issue);
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Book MyBook = new Book();
        //MyBook.getId(001);
        //MyBook.getYear(2002);
        //MyBook.getTitle("Naruto Uzumaki");
        //MyBook.Author("Japanese Legend");
        //System.out.print(MyBook.getId(001)+ " "+MyBook.getYear(2002)+" "+MyBook.getTitle("Naruto Uzumaki"));
        MyBook.Author(001,"Naruto Uzumaki",2002,"  Japanese Legend");

        Magazine MyMagazine = new Magazine();
        //MyMagazine.getId(001);
        //MyMagazine.getYear(2002);
        //MyMagazine.getTitle("Naruto Uzumaki");
        //MyMagazine.Issue(2);
        //System.out.print(MyMagazine.getId(002)+ " "+MyMagazine.getYear(2005)+" "+MyMagazine.getTitle("Naruto Uzumaki Shipuden")+" ");
        MyMagazine.Issue(002,"Naruto Uzumaki shipuden",2005,0);



    }
}