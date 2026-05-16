class book{
    int page;
    int rate;

    public book(){
        this(10,20);
        System.out.println("first Constructor  without parameterize constr.....");
    }


    public book(int page){
        this(page,20);
        System.out.println("2nd  Constructor  with parameterize constr.....");
    }


    public book(int page,int rate){
        this.page=page;
        this.rate=rate;
        System.out.println("3rd  Constructor  with parameterize constr.....");
    }


    public void display(){
        System.out.println("page is: " + page);
        System.out.println("rate is: " + rate);
    }

}


public class ThisKeyWordInconstructorCalling {
    public static void main(String[] args) {
        book b = new book();
        book b1 = new book(20);
        book b2 = new book(20,120);

        b.display();
        b1.display();
        b2.display();
    }
}
