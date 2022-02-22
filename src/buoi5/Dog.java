package buoi5;

public class Dog {

    // implementation
    private int size ; 
    private String  breed ; 
    private String name  ; 

    // interface
    public void setSize(int size ){
        if(size > 0){
            this.size = size ;
        }else{
            System.out.println("Kich thuoc khong phu hop!!");
        }


    }

    public int getSize(){
        return this.size ;
    }
    public void setName(String name ){
       this.name = name ;
    }

    public String getName(){
       return this.name ;
    }

    public void setBreed(String breed){
        this.breed = breed ;
    }

    public String getBreed(){
        return this.breed ;
    }
}
