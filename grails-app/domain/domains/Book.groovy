package domains

class Book {
    String name
    Boolean active

    //Comment this method to check the error in Bootstrap when reading the isActive() getter
    Boolean isActive() {
        active
    }
}