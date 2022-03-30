package testprojectgrails515

import domains.Book

class BootStrap {

    def init = { servletContext ->
        Book book1 = new Book(name:"book name", active: false)
        println book1.isActive()
    }
    def destroy = {
    }
}
