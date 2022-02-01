package postrequest.with.json;

public interface PersonService {
    public Person saveUpdatePerson(Person person);
    public Person findPersonById(Integer id);
}
