import demo.Person

class BootStrap {

    def init = { servletContext ->
        def carl = new Person(name: 'Carl')
        carl.addToFriends(name: 'Keith')
        carl.addToFriends(name: 'Greg')
        carl.save()
    }
    def destroy = {
    }
}
