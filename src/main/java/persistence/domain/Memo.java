package persistence.domain;

import javax.persistence.*;

@Entity
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String note;

    private Long userId;


    public Memo(){

    }

    public Memo(long userId, String note){
        this.userId = userId;
        this.note = note;
    }

    public Memo(String note){
        this.note = note;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public String getNote(){
        return note;
    }

    public void setNote(String note){
        this.note = note;
    }





}
