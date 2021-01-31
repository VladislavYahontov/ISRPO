package com.company;

public class Main {

    public static void main(String[] args) {
//        Car c1 = new Car("Mercedes-Benz" , "S-klasse","S500", 700000 ,2015) ;
//        c1.println();
//        Car c2 = new Car("BMW" , "7 Series","750 Li", 705000 ,2016) ;
//        c2.println();
//        Car c3 = new Car("Audi" , "A8","Long", 745000 ,2016) ;
//        c3.println();


        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType );

        switch(b1.bookType){
            case BELLETRE:
                System.out.println("\nBelletre");
                break;
            case SCIENCE:
                System.out.println("\nScience");
                break;
            case SCIENCE_FICTION:
                System.out.println("\nScience fiction");
                break;
            case PHANTASY:
                System.out.println("\nPhantasy");
                break;
        }


        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24






    }
}
class Book{

    String name;
    Type bookType;
    String author;

    Book(String name, String author, Type type){

        bookType = type;
        this.name = name;
        this.author = author;





    }
}

enum Type
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}


enum Operation{
    SUM{
        public int action(int x, int y){ return x + y;}
    },
    SUBTRACT{
        public int action(int x, int y){ return x - y;}
    },
    MULTIPLY{
        public int action(int x, int y){ return x * y;}
    };
    public abstract int action(int x, int y);
}


//        Button button = new Button(new ButtonClickHandler());
//        button.click();
//        button.click();
//        button.click();
//    }
//}
//
//class ButtonClickHandler implements EventHandler{
//
//    public void execute(){
//
//        System.out.println("Кнопка нажата!");
//    }
//}
//
//interface EventHandler{
//
//    void execute();
//}
//
//class Button{
//
//    EventHandler handler;
//    Button(EventHandler action){
//
//        this.handler=action;
//    }
//    public void click(){
//
//        handler.execute();
//    }
//}

