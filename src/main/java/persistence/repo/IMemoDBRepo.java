package persistence.repo;

public interface IMemoDBRepo {

    String getUsersAll();
    String getUsersNotes(Long userId);
    String addUser(String userJson);
    String removeUser(Long id);
    String updateUser(String userJson);
    String removeNote(Long id);
    String addNote(String memo);
    String updateNote(String memo);


}
