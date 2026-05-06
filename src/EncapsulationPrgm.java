class book1{
    private int pageNum;

    public void setData(int x){
        if(x>0) {

            pageNum = x;
        }
    }
    public void getData() {
        System.out.println(pageNum);
    }
}
public class EncapsulationPrgm {
    public static void main(String[] args) {
        book1 b = new book1();
        b.setData(12);
        b.getData();

        b.setData(-200);//"it won't work because of  data member of class is private and with condition you cant access the private data member directly that y we use the getter and setters "
    }
}
